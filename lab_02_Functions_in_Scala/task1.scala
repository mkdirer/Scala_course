object Main {
  def angDeg( angle : Double): Unit ={
    println("angle                     " + "     cos           " +
      "       sin         " + "           tan        ")
    for(i<-0 to 20){
      val ang_deg = angle + i - 10
      println(ang_deg + "rad    "+math.cos(ang_deg)+"     "+math.sin(ang_deg)+"     "+math.tan(ang_deg))
    }
  }

  def main(args: Array[String]): Unit = {
    val argAngle = 0.5
    val angle =  if(args(1) =="deg") (argAngle*math.Pi)/180.0 else  argAngle
    angDeg(angle)
  }
}