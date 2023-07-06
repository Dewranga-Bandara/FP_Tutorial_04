object Q3 {
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    names.foreach { name => val formattedName = formatNames(name) { name =>
      if (name.length % 2 == 0)
        toUpper(name)
      else
        toLower(name)
    }
      println(formattedName)
    }
  }
}

