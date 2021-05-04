import scala.annotation.tailrec
import scala.collection.IterableOnce.iterableOnceExtensionMethods

object ex1 {

  def filterLis(list: List[String], predicate: String => Boolean):List[String]=
    {
      var filtered: List[String]=Nil
      @tailrec def acc(inList: List[String]):Any={
        if(inList.isEmpty){return}
          if(predicate(inList.head))
            {
              filtered =filtered:+inList.head
            }
        acc(inList.tail)
      }
      acc(list)
      filtered
    }


  def reverseList(list:List[String]): List[String]={
    var reversed:List[String]=Nil
    @tailrec def acc(inList: List[String]):Any={
      if(inList.isEmpty){return}
      reversed = inList.head :: reversed
      acc(inList.tail)
    }
    acc(list)
    reversed
  }

  def main(args: Array[String]): Unit = {
    val pred1 = (x:String) =>
      x.contains('p')
    println(filterLis(list=List("Hello", "there", "people"), predicate = pred1));

    println(reverseList(list=List("Hello", "there", "people")));
  }
}
