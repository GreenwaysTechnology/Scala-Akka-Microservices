package com.mycom.oop

/**
 * public class GreetingMain {
 * public static void main(String args[]){
 *
 * }
 * }
 * GreetingMain.main()
 */
//Single ton means , can have static methods , in scala there is no static keyword
object GreetingMain {
  def main(args: Array[String]): Unit = {
    var greeting = new Greeting();
    println(s"${greeting.name} ${greeting.message}")
    greeting = new Greeting(); //constructor call
    greeting.message = "Hai";
    greeting.name = "Ram";
    println(s"${greeting.name} ${greeting.message}")
    //No need of() incase of default constructors
    greeting = new Greeting //constructor call
    println(s"${greeting.name} ${greeting.message}")
  }
}
