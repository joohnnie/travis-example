import sbt.Keys._

name := "travis-example"

version := "1.0.0"

scalaVersion := "2.11.7"

organization := "org.dooit"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

libraryDependencies ++= Seq(
  "com.storm-enroute" %% "coroutines" % "0.4")

