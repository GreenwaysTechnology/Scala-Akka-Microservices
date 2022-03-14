package com.incdoinc.actor.childactors

import akka.actor._;

class RootActor extends Actor {
  def receive = {
    case msg: String =>
      //Get information about this actor itself- self
      println("Current Actor Information", self.path.name)
      //Get information about Parent actor
      println("Parent Actor information ", context.parent.path.name)
      //using context create new Child Actors
      val childActorRef = context.actorOf(Props[ChildActor], "Child")
      //send message to child Actor
      childActorRef ! s" ${msg} , Hello Child"
  }
}

class ChildActor extends Actor {
  override def receive: Receive = {
    case msg: String => println(s"$msg") // Default ca
  }
}


object ChildActors {
  def main(args: Array[String]): Unit = {

    val system = ActorSystem("GreetingSystem")
    //create RootActor
    val rootActorRef = system.actorOf(Props[RootActor], "RootActor")
    rootActorRef ! "Hello Root!";

  }
}
