object ex1 {
  abstract class Animal {
    type A
    def eat(a:A)
  }
  abstract class Plants {
    override def toString: String = "Plants"
  }

  trait Meat{
    override def toString: String = "Meat"
  }

  class Rabbit extends Animal with Meat {
    type A = Plants
    def eat(z : A): Unit = {
      System.out.println(this + " crunches the " + z)
    }

    override def toString: String = "Rabbit"
  }

  class Wolf extends Animal {
    type A = Meat
    def eat(y: A) : Unit = {
      System.out.println(this + " tears apart the " + y)
    }
    override def toString: String = "Wolf"
  }
  class Carrot extends Plants {
    override def toString: String = "Carrot"
  }

  def main(args: Array[String]): Unit = {
    val c: Plants = new Carrot
    val r = new Rabbit

    val w = new Wolf

    // this two shold compile and run w/o problems

    //r.eat(c)

   // w.eat(r)
    // whereas these should not compile

    //r.eat(r)

    //w.eat(c)

  }
}
