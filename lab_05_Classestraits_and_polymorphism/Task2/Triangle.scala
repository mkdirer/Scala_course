package //scieżka do pliku

class Triangle(center: (Int,Int), val rotation: Int, size: Int) extends Shape(center,size) {
  override def toString: String = f"Triangle of side size $size rotation $rotation at $center"
}

object Triangle {
  def apply(center:(Int,Int), rotation:Int, size:Int) = new Triangle(center, rotation, size)
}