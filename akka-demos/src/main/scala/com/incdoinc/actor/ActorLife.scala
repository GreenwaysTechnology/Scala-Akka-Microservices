package com.incdoinc.actor

import akka.actor.{Actor, ActorSystem, Props}

class GreetingActor extends Actor {
  def receive = {
    case greet: String => println(s"$greet")
  }

  override def preStart(): Unit = {
    println("preStart")
  }

  override def postStop(): Unit = {
    println("postStop")
  }

}

object ActorLife extends App {
  val system = ActorSystem();
  val actor = system.actorOf(Props[GreetingActor], "GreetingActor");
  actor ! "Hello"
  //un deploying the actor from the actorEngine
  system.stop(actor);
 // actor ! "Hello"

}
