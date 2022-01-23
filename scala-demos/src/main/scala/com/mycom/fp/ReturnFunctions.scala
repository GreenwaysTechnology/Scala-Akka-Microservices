package com.mycom.fp


object ReturnFunctions {
  def main(args: Array[String]): Unit = {
    var res = sayGreet();
    //invoke the function.
    res();
    var hai = sayHai()
    hai();


    def names = getName();
    println (names("Subramanian", "Murugan"))

    //short cuts
    sayGreet()();
    println(getName()("Subramanian","Murugan"))

  }

  //here function returns string
  //  def sayGreet (): String = {
  //     "Hello"
  //  }
  //here function returns "function"
  def sayGreet(): () => Unit = {
    //return function
    var hai = () => println("Hello")
    hai
  }

  def sayHai(): () => Unit = {
    //returning function
    () => println("Hello")
  }

  //parameters for returning function
  def getName(): (String, String) => String = {
    (firstName: String, lastName: String) => s"${firstName} ${lastName}"
  }
}
