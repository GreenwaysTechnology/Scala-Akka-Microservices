package com.incdoinc.actor.interaction.patterns


import akka.actor.{Actor, ActorSystem, Props};
class ActorReplyExample extends Actor{
  def receive = {
    /**
     * The reference sender Actor of the last received message.
     * Is defined if the message was sent from another Actor,
     * else deadLetters in ActorSystem.
     */
    case message:String => println("Message recieved from "+ sender.path.name+" massage: "+message);
      val child = context.actorOf(Props[ActorChildReplyExample]);
      child ! "Hello Child"

  }
}


class ActorChildReplyExample extends Actor{
  def receive ={
    case message:String => println("Message recieved from "+sender.path.name+" massage: "+message);
      println("Replying to "+sender().path.name);
      sender()! message.toUpperCase;
  }
}

object ActorReplyExample{
  def main(args:Array[String]){
    val actorSystem = ActorSystem("ActorSystem");
    val actor = actorSystem.actorOf(Props[ActorReplyExample], "RootActor");
    actor ! "Hello";
  }
}