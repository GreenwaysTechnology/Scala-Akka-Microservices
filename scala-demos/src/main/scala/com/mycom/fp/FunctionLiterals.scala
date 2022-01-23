package com.mycom.fp

object FunctionLiterals {
  def main(args: Array[String]): Unit = {

    var sayHai = () => {
      println("Lambda expression !")
    }
    println(sayHai.getClass())
    sayHai();

    //lambda syntax simplification : if lambda has no body you can omit {}
    sayHai = () => println("Lambda expression !")
    sayHai();

    //if multi line you can keep {} but not necessary
    sayHai = () => {
      println("Hello")
      println("Hai!!!!")
    }
    sayHai();

    //Lambda with parameters : Lambda must not have explicit return statement.
    var add = (a: Int, b: Int) => {
      a + b;
    }
    println(add(10, 10))
    //lambda without {}
    add = (a: Int, b: Int) => a + b
    println(add(10, 106))

    //returning expressions
    var greeter = () => "Welcome to Scala ";
    println(greeter())
    //no args only expression
    greeter = () => {
      "Welcome to Scala "
    }
    println(greeter())
    ////////////////////////////////////////////////////////////////////////////////////////////
    //Skipping parameter names
    var myfun = (firstName: String, lastName: String) => firstName + lastName;
    println(myfun("Subramanian","Murugan"))

    //_wild card chracter to remove declaration
    var myfc2 = (_:String) + (_:String)
    println(myfc2("Subramanian","Murugan"))
    var adder = (_:Int) + (_:Int)
    println(adder(10,10))

  }
}
