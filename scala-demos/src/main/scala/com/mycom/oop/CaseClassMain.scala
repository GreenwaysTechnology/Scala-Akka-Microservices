package com.mycom.oop

case class Person(name: String, var relation: String)

object CaseClassMain {
  def main(args: Array[String]): Unit = {
    var person = Person.apply("Subramanian", "Manager")
    person.relation = "CEO"
    print(person.name,person.relation)
  }
}
