object ex1 {
abstract class food
  {
    def price: Double
    def content: List[String]
  }

  class Sandwitch extends food {
    override def price:Double ={
      0.5
    }

    override def content: List[String] = {
      List("Sandwitch")
    }
  }

  trait Egg extends food {
    abstract override def content: List[String] = {
      super.content :+ "Egg"
    }
    abstract override def price: Double ={
      super.price + 1.5
    }
  }

  trait Butter extends food {
    abstract override def content: List[String] = {
      super.content :+ "Butter"
    }
    abstract override def price: Double ={
      super.price + 0.5
    }
  }

  trait Salad extends food {
    abstract override def content: List[String] = {
      super.content :+ "Salad"
    }
    abstract override def price: Double ={
      super.price + 2.0
    }
  }

  trait Ham extends food {
    abstract override def content: List[String] = {
      super.content :+ "Ham"
    }
    abstract override def price: Double ={
      super.price + 9.6
    }
  }

  trait Cheese extends food {
    abstract override def content: List[String] = {
      super.content :+ "Chesse"
    }
    abstract override def price: Double ={
      super.price + 4.4
    }
  }

  trait Mayonaise extends food {
    abstract override def content: List[String] = {
      super.content :+ "Mayonaise"
    }
    abstract override def price: Double ={
      super.price + 1.0
    }
  }


  class ChefsBest extends Sandwitch with Butter with Salad with Ham with Cheese

  def main(args: Array[String]): Unit = {

    val myLunch =  new Sandwitch with Butter with Salad with Egg with Mayonaise

    val yourLunch = new Sandwitch with Ham
    println(myLunch.price) // 5.5 exact number are not relevant of course

    println(myLunch.content) // results in List[Sandwitch, Butter, Salad Egg, Mayonaise]

  }
}
