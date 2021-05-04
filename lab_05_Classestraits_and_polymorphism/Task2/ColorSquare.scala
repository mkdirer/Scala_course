package //scieżka do pliku

class ColorSquare(center: (Int,Int), size: Int, var color: (Int,Int,Int))
  extends Square(center,size) with HasColor {
  override def toString: String = s"Square of size $size at $center with color r:$red g:$green b: $blue"
}

object ColorSquare {
  def apply(center:(Int,Int), size:Int, color:(Int,Int,Int)) = new ColorSquare(center, size, color)
}