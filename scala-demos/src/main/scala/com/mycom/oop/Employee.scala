package com.mycom.oop

class Employee(var id: Int = 0, var firstName: String = "", var lastName: String = "") {
  override def toString: String = s"${id} $firstName $lastName"
}

//if class has no methods only data : data class //no necessary of {}
class Stock(var symbol: String = "google", var price: BigDecimal = 100)

//if class has a  releation ship
class Address(
               var street: String = "street",
               var city: String = "city",
               var state: String = "state"
             )

class Customer(var id: Int = 0, var name: String = "name", var address: Address = new Address)

//class constructors are used to have expression

class Guest(var firstName: String = "firstName") {
  //body of the constructor
  println("Guest is being initialized")
  //variables
  var from: String = "From city"

  //methods
  def printCity(): Unit = println(this.firstName, this.from)

  printCity()
}

///Auxiliary class constructors

/**
 * 1.it is special method started with this keyword
 * 2.those constructors must be called by other constructors
 */
class Building(var totalSize: Int = 0, var buildingType: String = "") {
  //one arg aux constructor
  def this(totalSize: Int) = {
    this(totalSize, "Home")
    println("Single Arg constructor is called")
  }

}