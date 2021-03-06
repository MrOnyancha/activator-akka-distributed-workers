import sbt.Keys.scalaVersion

name := "akka-distributed-workers"

version := "0.1"

scalaVersion := "2.12.6"
lazy val akkaVersion = "2.5.17"

fork in Test := true

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion, 
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  "org.iq80.leveldb" % "leveldb" % "0.7",
  "org.fusesource.leveldbjni" % "leveldbjni-all" % "1.8",
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "commons-io" % "commons-io" % "2.4" % "test")
