name := "Chaiwat_200-6"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "mysql"%"mysql-connector-java"%"8.0.17"
)     

play.Project.playJavaSettings
