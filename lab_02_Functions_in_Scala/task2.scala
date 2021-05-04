object Main {
  def niceRowPrint( row: Array[Int]){
    println(row.mkString("|", " ", "|"))
  }

  def nicePrint( arr: Array[Array[Int]]): Unit = {
   arr.foreach(niceRowPrint(_))
  }

  def main(args: Array[String]): Unit = {
    val x = Array.ofDim[Int](4,5)
    for( i<-0 until 4; j<-0 until 5) x(i)(j)=i+j
    nicePrint(x)
  }
}