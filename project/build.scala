import sbt._
import Keys._

object build extends Build {
  import dependencies._

  lazy val standardSettings = Defaults.defaultSettings ++ Seq(
  	resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/",
    organization := "com.github.momania",
    version			 := "2.1-SNAPSHOT",
    scalaVersion := "2.9.1-1"
  )

  lazy val root = Project(
    id        = "akka-amqp",
    base      = file("."),
    settings = standardSettings ++ Seq(
    	libraryDependencies ++= Seq( 
	      AmqpClient,
        AkkaActor,
	      Specs2,
        JUnit,
        AkkaTestKit,
        Mockito)
    )
  )
}
