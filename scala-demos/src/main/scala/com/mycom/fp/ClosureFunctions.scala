package com.mycom.fp

object ClosureFunctions {
  def main(args: Array[String]): Unit = {
    var factor = 3
    val multiplier = (i: Int) => i * factor
    println(multiplier(10))
    println(multiplier(5))

  }
}
