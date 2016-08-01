name := "bitfinex-api-scala"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.json4s" % "json4s-native_2.11" % "3.4.0"
libraryDependencies += "com.typesafe.play" %% "play-ws" % "2.5.4"
libraryDependencies += "org.tpolecat" % "doobie-core_2.11" % "0.3.0"

libraryDependencies += "org.scalactic" %% "scalactic" % "2.2.6"
libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.13.2" % "test"