package com.mycom

object Loops {
  def main(args: Array[String]): Unit = {
    //Collection
    //Seq
    val nums = Seq(1, 2, 3)
    for (n <- nums) println(n)
    //List
    val skills = List("Scala", "Java", "Microservices");
    //for loop
    for (skill <- skills) println(skill)
    //for each method
    skills.foreach(skill => println(skill))
    skills.foreach(println)
    //Maps
    val reviews = Map(
      "The Spider Man : No way Home" -> 4,
      "The Matrix Final Chapter " -> 3.5
    )
    for ((movie, rating) <- reviews) println(s"Movie => $movie Rating=> $rating")

  }
}
