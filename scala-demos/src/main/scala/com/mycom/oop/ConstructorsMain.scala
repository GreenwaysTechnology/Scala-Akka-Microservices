package com.mycom.oop

object ConstructorsMain {
  def main(args: Array[String]): Unit = {
    var employee = new Employee; //default constructor
    println(employee.toString)
    employee = new Employee(1, "subramanian", "Murugan"); //default constructor
    println(employee.toString)

    employee = new Employee(3); //default constructor
    println(employee.toString)
    //named parameters : help to pass values in any order
    employee = new Employee(lastName = "Murugan")
    println(employee.toString)

    //instance of Stock
    val stock = new Stock()
    println(stock.price, stock.symbol)

    var customer = new Customer;
    println(customer.id, customer.name, customer.address.city)
    customer = new Customer(id = 1, name = "Subramanian", address = new Address(city = "Coimbatore"))
    println(customer.id, customer.name, customer.address.city)

    //constructor blocks
    var guest = new Guest
    var building = new Building
    building = new Building(1800)
  }
}
