package com.mycom

object ControlStructures {
  def main(args: Array[String]): Unit = {
    //control structure // Statement driven
    var a = 100;
    var b = 300;
    if (a < b) {
      println("good value")
    } else {
      println("bad value")
    }
    //control structure // expression driven
    val res = if (a > b) "A is greater" else "B is greater";
    println(res);

  }
}
