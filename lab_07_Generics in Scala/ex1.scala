object ex1 {
  def main(args: Array[String]): Unit = {
    val p = "91051123891"

    val PESELExtr(year, month, day, sex) = p
    println("y: " + year + " m: " + month + " d: " + day + " s: " + sex)

    val p2 = "91051123893"

    val PESELExtr(year2, month2, day2, sex2) = p2
    println("y: " + year2 + " m: " + month2 + " d: " + day2 + " s: " + sex2)
  }

  case class PESELExtr(year: String, month: String, day: String, sex: String)

  object PESELExtr {
    def apply(
               year: String,
               month: String,
               day: String,
               sex: String
             ): PESELExtr = new PESELExtr(year, month, day, sex)

    def unapply(s: String): Option[(String, String, String, String)] = {
      val weight: Vector[Int] = Vector(1, 3, 7, 9, 1, 3, 7, 9, 1, 3)
      val elements = s
        .dropRight(1)
        .toCharArray
        .map(_.toInt)
        .zipWithIndex
        .map {
          case (elem, i) => elem * weight(i)
        }
        .toList
        .sum
      val checksum = 10 - math.floorMod(elements, 10)
      if (checksum == s.charAt(10).asDigit) {
        Some(
          s.substring(0, 2),
          s.substring(2, 4),
          s.substring(4, 6),
          s.substring(6, 11)
        )
      } else {
        None
      }
    }
  }
}
