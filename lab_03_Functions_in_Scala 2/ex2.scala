object ex2 {
  import scala.annotation.tailrec
  def sumfrac(esp: Double):Double = {

    var count: Double = 0

    @tailrec def nom(curr: Double): Unit = {
      if (curr > esp) {
        count += curr
        nom(curr / 2.0)
      }
    }
      nom(1.0)
      count
    }

  def main(args: Array[String]): Unit = {

    val sum1 = sumfrac( 1e-3 )
    val sum2 = sumfrac( 1e-9 )

    println(sum1)
    println(sum2)
  }
}
