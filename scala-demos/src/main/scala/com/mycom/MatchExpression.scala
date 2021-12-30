package com.mycom

object MatchExpression {
  def main(args: Array[String]): Unit = {
    val month = 3;
    //match expression
    month match {
      case 1 => println("Jan")
      case 2 => println("Feb")
      case 3 => println("Mar")
      case 4 => println("Apr")
      case _ => println("Invalid Month")
    }

    val monthName = month match {
      case 1 => "Jan"
      case 2 => "Feb"
      case 3 => "Mar"
      case 4 => "Apr"
      case _ => "Invalid Month"
    }
    println(monthName)
    //odd and even numbers
    val num = 6
    val evenOrOdd = num match {
      case 1 | 3 | 5 | 7 | 9 => "odd"
      case 2 | 4 | 6 | 8 | 10 => "even"
      case _ => "No match Found"
    }
    println(evenOrOdd)
    //Range Operator : DSL Code
    num match {
      case a if 0 to 9 contains(a) => println("0 to 9=>" + a)
    }
  }
}