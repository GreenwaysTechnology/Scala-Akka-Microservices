package com.mycom.fp

object CurryFunctions {
  def main(args: Array[String]): Unit = {
    val sumRes = sum(10, 10)
    println(s" Sum => $sumRes")
    //calling curry version of method
    println(sumCurry(12)(12))

    //lambda curry
    //regular lambad
    val sumV2: (Int, Int) => Int = (x, y) => x + y;
    //curry function
    var curriedSum: Int => Int => Int = sumV2.curried
    println(curriedSum(10)(10))
    var amount = atm("8883434")(1234)(10000.00)
    println(s"Amount  withdrawn => ${amount}")

  }

  //regular function
  def sum(x: Int, y: Int): Int = x + y

  //curry version of sum. // method syntax
  def sumCurry(x: Int)(y: Int): Int = x + y

  //atm simulation
  def atm(cardIn: String)(accpetPin: Int)(withdrawAmt: Double) = s"${cardIn} ${withdrawAmt}"

}
