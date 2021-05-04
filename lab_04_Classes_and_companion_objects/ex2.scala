object task extends App {
  case class MapPoint(name: String, lat: Double, lon: Double) {
    def distanceTo(other: MapPoint): Any = this - other

    def -(other: MapPoint): Double = {
      math.sqrt(math.pow(other.lat - lat, 2) + math.pow(other.lon - lon, 2))
    }

    def move(dlat: Double, dlon: Double): MapPoint = {
      MapPoint("Nearby " + name, lat + dlat, lon + dlon)
    }

    override def toString: String = {
      val latS = if (lat >= 0) { lat + "N" } else { -lat + "S" }
      val lonS = if (lon >= 0) { lon + "E" } else { -lon + "W" }
      name + " " + latS + " " + lonS
    }
  }

  def inTheMiddle(p1: MapPoint, p2: MapPoint, name: String): MapPoint = {
    val lat = (p1.lat + p2.lat) / 2.0
    val lon = (p1.lon + p2.lon) / 2.0
    MapPoint(name, lat, lon)
  }

  case class Route(points: MapPoint*) {
    var pts: Seq[MapPoint] = points
    def addStop(point: MapPoint): Unit = {
      pts = pts :+ point
    }

    override def toString: String = {
      val pr = pts.reverse
      var out: String = pr.head.toString
      for (p <- pr.tail) {
        out += " -> " + p.toString
      }
      out
    }
  }

  val krk = MapPoint("Krakow", 50.061389, 19.938333);

  println(krk);

  val nyc = MapPoint("NYC", 40.7127, -74.0059);

  println(nyc);

  val porto = MapPoint("Porto", 41.162142, -8.621953);

  val irkutsk = MapPoint("Irkutsk", 52.283333, 104.283333);

  println(irkutsk);

  println(porto - irkutsk)

  println(krk - irkutsk)

  println(krk.distanceTo(porto))

  val mp = inTheMiddle(krk, irkutsk, "Somwhere in Russia");

  println(mp + " " + (mp - krk) + " " + (mp - irkutsk))

  val r = Route(krk, nyc, porto)

  println(r);

  r.addStop(porto.move(1, 1))

  r.addStop(irkutsk)

  println(r)

}