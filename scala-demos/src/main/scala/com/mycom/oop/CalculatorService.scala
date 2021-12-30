package com.mycom.oop

class Calculator {
  //add methods
  def addV1(): Int = {
    println("Add method")
    return 10 + 10;
  }

  //methods with args
  def addV2(a: Int, b: Int): Int = {
    return a + b;
  }

  //default args
  def addV3(a: Int = 0, b: Int = 0): Int = {
    return a + b;
  }

  //if method having single ling of body ; we can remove {} and return statement
  def addV4(a: Int = 2333, b: Int = 99999): Int = a + b

  //multi line body without return statement
  def addV5(a: Int = 2333, b: Int = 99999): Int = {
    println("addV5")
    println("This is nice syntax")
    a + b // last line of code is implied as return value
  }

  //void : Unit
  def doStuff(): Unit = {
    println ("doStuff")
  }

}