package com.incdoinc.actor.interaction.patterns

import akka.actor.{Actor, ActorSystem, Props}
import akka.pattern.ask
import akka.util.Timeout

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.language.postfixOps

class GreeterAskTimeout extends Actor {
  def receive = {
    case msg: String => println(s"Message Received ${msg} from the outside actor instance")
      //Block this thread for some time
      Thread.sleep(5000)
      println("Reply...")
      val senderName = sender();
      senderName ! "Hello,I got Message" // reply message
  }
}

object AskReplyWithoutTimeout extends App {
  val system = ActorSystem("ActorSystem");
  val actor = system.actorOf(Props[GreeterAskTimeout],"RootActor");
  implicit val timeout = Timeout(2 seconds)
  val future = actor ? "Hello"
  //read value from the future
  val value = Await.result(future, timeout.duration)
  println("From the Main " + value)
}
