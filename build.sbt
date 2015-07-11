name := "find-artists"

version := "1.0"

scalaVersion := "2.10.2"

sbtVersion := "0.13.1"

seq(webSettings : _*)

libraryDependencies ++= Seq(
  "org.springframework"      % "spring-webmvc"   % "4.0.0.RELEASE",
  "org.springframework.data" % "spring-data-jpa" % "1.8.1.RELEASE",
  "org.hibernate"            % "hibernate-entitymanager" % "4.3.10.Final",
  "org.hibernate.javax.persistence" % "hibernate-jpa-2.1-api" % "1.0.0.Final",
  "mysql"             % "mysql-connector-java" % "5.1.35",
  "org.eclipse.jetty" % "jetty-webapp"         % "9.1.0.v20131115" % "container, compile",
  "org.eclipse.jetty" % "jetty-jsp"            % "9.1.0.v20131115" % "container"
)

