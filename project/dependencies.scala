import sbt._

object dependencies {

  def AmqpClient = "com.rabbitmq" % "amqp-client" % "2.8.2"

  def AkkaActor = "com.typesafe.akka" % "akka-actor" % "2.0"

  def Specs2 = "org.specs2" %% "specs2" % "1.9" % "test"
  def JUnit = "junit" % "junit" % "4.7" % "test"
  def AkkaTestKit = "com.typesafe.akka" % "akka-testkit" % "2.0" % "test"
  def Mockito = "org.mockito" % "mockito-all" % "1.9.0" % "test"
}
