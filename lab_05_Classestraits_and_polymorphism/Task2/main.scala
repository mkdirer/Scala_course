package //scieżka do pliku

object main extends App {
  implicit def Double2Float(x: Double): Float = x.toFloat
  val a = ColorTriangle(center=(0,0), rotation=30, size=25, color=(20,20, 120))

  a.setColor(100,0,70)

  a.increaseRedBy(2.0) // czerwony = czerwony + czerwony*2

  val b = ColorSquare(center=(3,3), size=12, color=(20,20, 120) )

  b.setColor(10, 255, 0)

  b.decreaseGreenBy(0.3)

  // itd ...

  val shapes = List[Shape]( Triangle((0,0), 90, 50), a, Square((3,-3), 10), b )

  println(shapes.mkString("\n"))
}