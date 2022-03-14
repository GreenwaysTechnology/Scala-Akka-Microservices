package com.incdoinc.actor

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

class HelloWorldActor extends Actor {
  //this is listener method which gets called when ever message is received
  override def receive: Receive = {
    case msg: String => println(s"$msg")
    case _ => println("Unknown message") // Default ca
  }
}


object ActorSystemMain extends App {
  println("Actor System begins")
  //start Akka Engine
  val system = ActorSystem("GreeterSystem")
  //properties : Hierachy information
  println(s" Actor Path info :  ${system./("Hello")}")
  println(s" Actor Root :  ${system./("Hello").root}")
  println(s" Actor Address :  ${system./("Hello").address} ")

  //create Actor instance from the Actor System.
  val props = Props[HelloWorldActor]
  //val helloWorldActor = system.actorOf(props,"hellworldActor");
  val helloActorRef: ActorRef = system.actorOf(Props[HelloWorldActor], "HelloWorldActor")

  //send the message to the Actor
  helloActorRef.tell("Hello", helloActorRef)
  helloActorRef ! "Hello Bang"
}
