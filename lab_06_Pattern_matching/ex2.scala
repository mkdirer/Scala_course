object ex2 {

  case class Company(name: String, origin: String)

  def getCompanies(value: List[Any]): List[Company] = {
    var companies: List[Company] = Nil
    val companyName = "company"
    val companyOrigin = "origin"
    value.foreach {
      case map: Map[String, String] =>
        map.keys.toList match {
          case x :: y :: Nil if x == companyName && y == companyOrigin =>
            val newCompany = Company(map(x), map(y))
            companies = companies :+ newCompany
          case _ =>
        }
      case _ =>
    }
    companies
  }

  val data = List( Map("name" -> "Jan", "fname" -> "Kowalski", "age" -> "45"),

    Map("company" -> "ABB", "origin" -> "Sweden"),

    Map("name" -> "Katarzyna", "fname" -> "Nowak", "age" -> "45"),

    Map("company" -> "F4", "origin" -> "Poland"),

    List("Cos", "innego"),

    Map("company" -> "Salina Bochnia", "origin" -> "Poland"),

    Map("company" -> "AGH", "origin" -> "Poland"),

    Map("name" -> "Krzysztof", "fname" -> "Krol", "age" -> "14")

  )

  def main(args: Array[String]): Unit = {
    val companies = getCompanies(data)
    println(companies)
  }
}