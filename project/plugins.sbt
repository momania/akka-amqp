resolvers += "sbt-idea-repo" at "http://mpeltonen.github.com/maven/" 

resolvers += "sbt-release-repo" at "http://gseitz.github.com/maven/"

// See: https://github.com/mpeltonen/sbt-idea/tree/sbt-0.10
// Provides the `gen-idea` command to sync the IDEA project structure.

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "0.11.0")
 