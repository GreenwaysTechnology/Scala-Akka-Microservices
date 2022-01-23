package com.mycom.fp

object NoNullPointerV2 {
  def main(args: Array[String]): Unit = {
    println(convert("100"));
    println(convert("100xx"));
  }

  def convert(number: String): Int = {
    try {
      //risky code : the code which may cause error at time.
      Integer.parseInt(number.trim())
    } catch {
      case e: Exception => 0
    }
  }
}
