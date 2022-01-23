package com.mycom.fp

object NoNullPointerV4 {
  def main(args: Array[String]): Unit = {
    //using case expressions
    var someNumber = "10xxx"
    convert(someNumber) match {
      case Some(i) => println(i)
      case None => println("sorry this is wrong number")
    }

  }

  def convert(number: String): Option[Int] = {
    try {
      //risky code : the code which may cause error at time.
      Some(Integer.parseInt(number.trim())) // Some[Integer]
    } catch {
      case e: Exception => None
    }
  }
}
