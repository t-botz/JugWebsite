import sbt._
import cloudbees.Plugin._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "JugWebsite"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    "com.typesafe.slick" %% "slick" % "1.0.0",
    "com.h2database" % "h2" % "+"

  )


  val main = play.Project(appName, appVersion, appDependencies)
    .settings(cloudBeesSettings :_*)
    .settings(
    CloudBees.applicationId := Some("sydneyjvmcommunity")
  )

}
