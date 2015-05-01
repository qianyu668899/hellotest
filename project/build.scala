import sbtrelease.ReleasePlugin._
import sbt._
import sbt.Keys._

object MyBuild extends Build {
  lazy val HelloTest = Project(
    id = "HelloTest",
    base = file("."),
    settings = Defaults.defaultSettings ++ releaseSettings ++ Seq( /* custom settings here */
      organization := "https://github.com/qianyu668899",
      version := "0.1.0",
      scalaVersion := "2.11.6",
      libraryDependencies ++= List(
        mongoDb,
        log
      )
    )
  )

  val mongoDb = "org.mongodb" %% "casbah"% "2.7.3"
  val log = "ch.qos.logback" % "logback-classic" % "1.1.2"

}
