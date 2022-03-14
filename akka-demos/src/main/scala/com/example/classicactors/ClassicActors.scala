package com.example.classicactors

import akka.actor.{Actor, ActorRef, ActorSystem, PoisonPill, Props}

import scala.concurrent.duration.DurationInt
import scala.language.postfixOps

//Object types
case object Ping;
case object Pong;

class Pinger extends Actor {
  var counter = 100

  def receive = {
    case Pong =>
      println(s"${self.path} recived Pong, Counter Value $counter")
      if (counter > 0) {
        counter -= 1
        sender() ! Ping
      } else {
        sender() ! PoisonPill
        self ! PoisonPill
      }

    case _ => println("Unknown Message")
  }
}

class Ponger(pinger: ActorRef) extends Actor {
  def receive = {
    case Ping =>
      println(s"${self.path} received ping")
      pinger ! Pong
  }
}


object ClassicActors extends App {
  val system = ActorSystem("PingPongSystem")
  val pinger = system.actorOf(Props[Pinger], "pinger")
  val ponger = system.actorOf(Props(classOf[Ponger], pinger), "ponger")

  //you have to pause main thread  for some time

  import system.dispatcher

  system.scheduler.scheduleOnce(500 millis) {
    println("delay")
    ponger ! Ping
  }


}
