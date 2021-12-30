package com.mycom.oop

object ObjectMethods {
  def main(args: Array[String]): Unit = {
    val calculator = new Calculator;
    println(calculator.addV1())
    println(calculator.addV2(12, 30))
    println(calculator.addV3())
    println(calculator.addV3(2, 90))
    println(calculator.addV3(12))
    println(calculator.addV4())
    println(calculator.addV5())
    println(calculator.doStuff())

  }
}
