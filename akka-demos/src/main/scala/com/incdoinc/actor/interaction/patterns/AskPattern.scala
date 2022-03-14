package com.incdoinc.actor.interaction.patterns


import akka.actor.{Actor, ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

class GreeterActor extends Actor {
  override def receive = {
    case msg: String => println(s"Got ${msg}")
  }
}


object AskPattern extends App {
  var system = ActorSystem("ActorSystem");
  val actor = system.actorOf(Props[GreeterActor], "GreeterActor")
  implicit val timeout = Timeout(2 seconds)
  val future = actor ? "Hello"
  //read value from the future
  val value = Await.result(future, timeout.duration)
  println(value)

}
