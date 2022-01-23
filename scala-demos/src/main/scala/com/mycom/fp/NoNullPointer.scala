package com.mycom.fp

object NoNullPointer {
  def main(args: Array[String]): Unit = {
    //with null pointer exception
    //println(convert("100"));
    //println(convert("100xx"));
    // convert("100xxx")
    convert(null)


  }

  def convert(number: String): Unit = {
    println(Integer.parseInt(number.trim()))
    //    try {
    //       //risky code : the code which may cause error at time.
    //        println(Integer.parseInt(number.trim()))
    //    } catch {
    //      case e: Exception => println (e)
    //    }
  }
}
