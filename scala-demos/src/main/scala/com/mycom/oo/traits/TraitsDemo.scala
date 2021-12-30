package com.mycom.oo.traits

//trait
trait Flyable {
  //abstract methods and non abstract methods
  def fly(): String;
}

trait Landable {
  def land(): String;
}

trait TakeOff {
  def takeOff(): String;
}

class AirPlane extends Flyable with Landable with TakeOff {
  override def fly(): String = "Airplan is flying"

  override def land(): String = "Landing Process begins";

  override def takeOff(): String = "Take Off Process begins"
}

/////////////////////
trait Pet {
  def speak = println("wo wo wo") // concrete implementation of a speak method

  def eat(): String // abstract
}

class Dog extends Pet {
  override def eat(): String = "Dog eats meat and bones"
}

///////////////////
abstract class Animal(name: String) {
  def speak: Unit = println(s"My name is $name")

  //non abstracts
  def takeCare(): Unit = {
    println("Take Care Pets")
  }
}

class Cow(name: String) extends Animal(name)

class Cat(var name: String = "John");

object TraitsDemo {
  def main(args: Array[String]): Unit = {
    // var airPlane:Flyable = new AirPlane;
    var airPlane = new AirPlane;
    println(airPlane.fly, airPlane.land, airPlane.takeOff);
    ///
    var pet = new Dog;
    pet.speak
    println(pet.eat)
    //without any class
    var myCat = new Pet {
      override def eat(): String = "Cat is drinking Milk"
    }
    myCat.speak
    println(myCat.eat)

    def cat = new Cat("puppy") with Pet {
      override def eat(): String = "Cat Drinks milk"
    }

    cat.speak
    println(cat.eat)

    var cow = new Cow("Fido")
    cow.speak
    cow.takeCare
  }
}
