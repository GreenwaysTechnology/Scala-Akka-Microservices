package com.incdoinc.actor.interaction.patterns


import akka.actor.{Actor, ActorSystem, Props}

class FireAndForgetActor extends Actor {
  override def receive: Receive = {
    case msg: String => println(s"$msg =>  ${Thread.currentThread.getName}")
    case _ => println("Unknown message") // Default ca
  }
}


object FireAndForgetPattern extends App {
  println("Fire and Forget ")
  val system = ActorSystem("FireAndForgetSystem")
  //Create new Actor
  var actor = system.actorOf(Props[FireAndForgetActor], "FireAndForget")
  //Send message and return control
  // fire and forget
  println(s"Sender Thread :  ${Thread.currentThread().getName}")
  actor ! "Hello"
  actor ! "hey"
  actor ! "welcome"

}
