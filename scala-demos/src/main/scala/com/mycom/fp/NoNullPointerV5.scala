package com.mycom.fp

//class Employee(
//                var firstName: String,
//                var lastName: String,
//                var city: String,
//                var salary: Double
//              )

class Employee(
                var firstName: Option[String],
                var lastName: Option[String],
                var city: Option[String],
                var salary: Option[Double]
              )

object NoNullPointerV5 {
  def main(args: Array[String]): Unit = {
    //    val emp = new Employee("Subramanian", "Murugan", null, 5000);
    //    println(s"${emp.firstName} ${emp.lastName} ${emp.city.toUpperCase()} ${emp.salary}")
    val emp = new Employee(Some("Subramanian"), Some("Murugan"), None, Some(5000));
  //    println(s"${emp.firstName} ${emp.lastName} ${emp.city} ${emp.salary}")
    println(s"${emp.firstName.get} ${emp.lastName.get} ${emp.city.getOrElse("default City")} ${emp.salary.get}")
  }
}
