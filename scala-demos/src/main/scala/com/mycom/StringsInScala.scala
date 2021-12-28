package com.mycom

object StringsInScala {
  def main(args: Array[String]): Unit = {
    //strings:
    var firstName = "Subramanian";
    var lastName = "Murugan";
    var name = s"$firstName $lastName"
    println(s"Name : $firstName $lastName")
    println(s"Name : $name");
    //multi line strings
    var htmlDoc =
      """
        |<html>
        |<body>
        |<h1>Hello</h1>
        |</body>
        |</html>
        |""".stripMargin
    println (htmlDoc)


  }
}
