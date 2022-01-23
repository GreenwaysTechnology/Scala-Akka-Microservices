package com.mycom.fp

object PartialFunction {
  def main(args: Array[String]): Unit = {
    //create new function called "partial function"
    var seedValue = 10;
    //increment by 2 , suppling seedvalue
    val increment = sum(seedValue)(_)
    println(increment(2))
    println(increment(20))
    println(increment(29))
    // lambda version
    val sumV2: (Int, Int) => Int = (x, y) => x - y;
    var curriedSum: Int => Int => Int = sumV2.curried
    //partial
    var decrement: Int => Int = curriedSum(12)(_);
    println(decrement(10))
  }

  def sum(x: Int)(y: Int): Int = x + y;
}
