object ex2 {
  def main(args: Array[String]): Unit = {
    val people = List( ("John", "Doe", 23, "male"), ("Joan", "Doe", 23, "female"), ("Steve", "Jenkins", 24, "male"), ("Eva", "Robinson", 25, "female"),

      ("Ben", "Who", 22, "male"), ("Janet", "Reed", 21, "female"), ("Rob", "Jenkins", 26, "male"), ("Ella", "Dawson", 27, "female") )

    case class Person(
                       name:String,
                       surname: String,
                       age: Int,
                       gender:String
                     )

    val matchedPeople:List[Person]= people.map(e=> Person(e._1, e._2, e._3, e._4))

    println(matchedPeople.filter(_.gender == "male"))
    println(matchedPeople.filter(_.gender == "female"))

    println(matchedPeople.filter(_.age > 23).map(_.name))

    println(matchedPeople.exists(p=>p.name == "Joe" || p.name == "John"))

    println(matchedPeople.sortWith(_.age < _.age).head.age > 20)

    println(matchedPeople.map(p => (p.name, p.age)))

    println(matchedPeople.groupBy(_.age))

    println(matchedPeople.partition(_.age > 23))

    println(matchedPeople.sortWith(_.age > _.age).head)
    println(matchedPeople.sortWith(_.age < _.age).head)

    println(matchedPeople.partition(_.gender == "male")._1.length ==
      matchedPeople
        .partition(_.gender == "male")
        ._2
        .length
    )

    println(matchedPeople.sortWith(_.age < _.age ). dropWhile(_.age <= 23))

  }
}
