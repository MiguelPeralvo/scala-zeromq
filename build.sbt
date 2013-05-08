name := "scala-zeromq"

organization := "com.mdialog"

version := "0.2.0"

scalaVersion := "2.10.1"

parallelExecution := false

scalacOptions ++= Seq("-unchecked", "-deprecation", "-language:postfixOps")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.2-M3",
//  "org.zeromq" %% "zeromq-scala-binding" % "0.0.7",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test",
  "com.typesafe.akka" %% "akka-testkit" % "2.2-M3" % "test"
)

resolvers ++= Seq(
 //   "Sonatype (releases)" at "https://oss.sonatype.org/content/repositories/releases/",
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)

publishTo <<= version { (v: String) =>
  if (v.trim.endsWith("-SNAPSHOT")) 
    Some(Resolver.file("Snapshots", file("../mdialog.github.com/snapshots/")))
  else
    Some(Resolver.file("Releases", file("../mdialog.github.com/releases/")))
}