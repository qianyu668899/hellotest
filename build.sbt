publishTo := Some("Sonatype Snapshots Nexus" at "https://github.com/qianyu668899/hellotest.git")
//publishTo := Some(Resolver.file("file",  new File( "~/.omsignal/bver/test/hellotest" )) )

publishMavenStyle := false

credentials += Credentials("Github repos", "github.com", "qianyu668899", "qsjy81zwxy")