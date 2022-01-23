package com.mycom.fp

object NoNullPointerV3 {
  def main(args: Array[String]): Unit = {
    println(convert("100"));
    println(convert("100xx"));
    //extract value from the Some
    println(convert("100").get);
    println(convert("100").getOrElse("0"));
    println(convert("100xx").getOrElse("sorry this is wrong number"));


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
