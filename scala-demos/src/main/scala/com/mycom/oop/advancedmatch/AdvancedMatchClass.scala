package com.mycom.oop.advancedmatch

trait Person {
  def name: String
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

//case class Methods
case class IPLTeam(name: String, lastWorldSeriesWin: Int)

object AdvancedMatchClass {
  def main(args: Array[String]): Unit = {
    val casePrinter = new CasePrinter
    println(casePrinter.getPrintableString(new Student("Ram", 3)))
    println(casePrinter.getPrintableString(new Teacher("Subramanian", "Scala")))

    val cubs1908 = IPLTeam("CSK", 2021)
    println(cubs1908.name, cubs1908.lastWorldSeriesWin)

    val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2017)

    println(cubs2016.name, cubs2016.lastWorldSeriesWin)

    var emp = null
  }
}
