object ex1 {
  import scala.math.{Pi}
  def pi: Double = Pi
  def pi(pi: Double) = pi * Pi
  def repN(a: Int, b : Int=>Int, c: Int): Int = {
      if(a!=c) b(repN(a-1,b,c))else b(c)
    }
  def printarg(arg: String): Unit =
  {
    print(arg)
  }
  def main(args: Array[String]): Unit = {
    println( pi ) // 3.1415
    println( pi(pi) ) // 9.86902225
    println( pi(pi(pi)) ) // 31.003533398375
    println(repN(5,  (x: Int) => 2*x , 1 )) //32
    // repeat function application N times i.e. f(f(f(f(f(1))))), 1 is the argument of the first invocation,

    printarg(arg="hello") // hello
    printarg( ) // -
  }

}

