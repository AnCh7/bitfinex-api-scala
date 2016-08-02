object RetrofitExample {

  def main(args: Array[String]): Unit = {

    val ticker = Bitfinex.getTicker("BTCUSD")
    val x = 0
  }
}

object Json4sExample {

  def main(args: Array[String]): Unit = {

    import org.json4s._
    import org.json4s.native.JsonMethods._
    implicit val formats = DefaultFormats

    case class Model(hello: String, age: Int)
    val rawJson = """{"hello": "world", "age": 42}"""

    println(parse(rawJson).extract[Model])
  }
}

object DoobieExample {

  def main(args: Array[String]): Unit = {

    import doobie.imports._
    import scalaz.effect.IO

    // http://tpolecat.github.io/doobie-0.3.0/01-Introduction.html

    val xa = DriverManagerTransactor[IO](
      "org.postgresql.Driver", "jdbc:postgresql:world", "postgres", ""
    )

    case class Country(code: String, name: String, population: Long)

    //    def find(n: String): ConnectionIO[Option[Country]] =
    //      sql"select code, name, population from country where name = $n".query[Country].option
    //
    //    val f = find("France").transact(xa).unsafePerformIO // Option[Country] = Some(Country(FRA, France, 59225700))
  }
}



