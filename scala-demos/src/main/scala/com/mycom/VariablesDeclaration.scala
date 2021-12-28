package com.mycom

object VariablesDeclaration {
  def main(args: Array[String]): Unit = {
    val a = 10;
    println("A is " + a)
    //a = 100;
    var b = 100
    println("B is " + b)
    b = 900;
    println("B is " + b)

    //Explicit type
    var c: Int = 90;
    println("C " + c);

  }
}
