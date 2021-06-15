name := "onelab-domain"

organization := "kz.one.lab"

version := "1.0"

scalaVersion := "2.12.10"

lazy val json4sVersion   = "3.5.3"

libraryDependencies ++= Seq(
  "org.json4s"             %% "json4s-core"       % json4sVersion,
  "org.json4s"             %% "json4s-jackson"    % json4sVersion,
  "org.json4s"             %% "json4s-native"     % json4sVersion,
)