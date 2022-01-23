package com.mycom.fp

object HigherOrderFunctions {
  def main(args: Array[String]): Unit = {
    //declare lambda - function literal
    var hello = () => println("Hello");
    sayGreet(hello)
    //anonymous function - passing function directly without storing into an variable
    sayGreet(() => println("Hello Again"))
    //function with parameters
    var hai = (name: String) => println(s"Hai ${name}");
    sayHai(hai);
    sayHai((name: String) => println(s"Hai ${name}"));

    //function with return value
    var howareYou = (name: String) => s"How Are you?  ${name}";
    sayHowAreY(howareYou);
    sayHowAreY((name: String) => s"How Are you?  ${name}");

    //more parameters
    login("admin", "admin", (status: String) => println(status), (err: String) => println(err))
    login("adminxxx", "admin", (status: String) => println(status), (err: String) => println(err))

    //Type inference in higher order functions
    login("admin", "admin", status => println(status), err => println(err))

    //type inference works only for inline anonmous functions
    var howareYou1 = (name: String) => s"How Are you?  ${name}";
    sayHowAreY(howareYou1);
    sayHowAreY(name => s"How Are you?  ${name}");

  }

  /**
   * function sayStreet(action){
   * action();
   * }
   * let hello = function(){
   * console.log('Hello');
   * }
   * sayGreet(hello)
   *
   */

  //method
  //action = () => println("Hello");
  def sayGreet(action: () => Unit): Unit = {
    //invoke the function which was passed
    action()
  }

  //callback function ; here action:DataType
  def sayHai(action: (String) => Unit): Unit = {
    action("Subramanian")
  }

  def sayHowAreY(action: (String) => String): Unit = {
    var res = action("Subramanian");
    println(res);
  }

  //
  def login(userName: String, password: String, success: (String) => Unit, failure: (String) => Unit): Unit = {
    //biz logic
    if (userName.equals("admin") && password.equals("admin")) {
      success("Login Successful")
    } else {
      failure("Login failed")
    }
  }


}
