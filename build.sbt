//publishTo := Some("Sonatype Snapshots Nexus" at "https://github.com")
//publishTo := Some(Resolver.file("file",  new File( "~/.omsignal/bver/test/hellotest" )) )
publishTo := None

publishMavenStyle := false

credentials += Credentials("Github repos", "github.com", "qianyu668899", "qsjy81zwxy")