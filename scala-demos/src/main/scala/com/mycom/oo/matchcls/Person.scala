package com.mycom.oo.matchcls

//default to val
//case class Person(name: String, relation: String)

trait Person {
  def name: String
  private var elements: List[Int] = Nil

  override def toString: String = ???
}

case class Student(name: String, year: Int) extends Person

case class Teacher(name: String, specialty: String) extends Person

class CasePrinter {
  def getPrintableString(p: Person): String = p match {
    case Student(name, year) =>
      s"$name is a student in Year $year."
    case Teacher(name, whatTheyTeach) =>
      s"$name teaches $whatTheyTeach."
  }
}

case class BaseballTeam(name: String, lastWorldSeriesWin: Int)

object CaseMain {
  def main(args: Array[String]): Unit = {
//        var person = Person.apply("Subramanian", "Father")
//    //    person.name = "new"
//        println(person.toString)
    var printer = new CasePrinter;
    var result = "";
    result = printer.getPrintableString(new Student("Subramanian", year = 3));
    println(result)
    result = printer.getPrintableString(new Teacher("Subramanian", "Microservices"))
    println(result)
    //clone
    val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
    println(cubs1908.name, cubs1908.lastWorldSeriesWin)
    val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)
    println(cubs2016.name, cubs2016.lastWorldSeriesWin)


  }
}
