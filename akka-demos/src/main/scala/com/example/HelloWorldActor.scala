package com.example

import akka.actor.{Actor, ActorSystem, Props}

class HelloWorldActor extends Actor {
  //this method is called when ever a message arrives to this actor.
  override def receive: Receive = {
    case msg: String => println(s"$msg")
    case _ => println("Unknown message") // Default case
  }
}
object HelloWorldActorMain extends App {
  //Creating Actor System - Actor Engine
  var actorSystem = ActorSystem("ActorSystem");
  //Create Actor
  var actor= actorSystem.actorOf(Props[HelloWorldActor],"HelloWorldAkka")
  //send message
  actor ! "Hello Akka"
}
