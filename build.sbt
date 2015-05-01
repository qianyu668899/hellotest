publishTo <<= (version) { version: String =>
  val scalasbt = "https://github.com/"
  val (name, url) = if (version.contains("-SNAPSHOT"))
    (" ", scalasbt+" ")
  else
    (" ", scalasbt+" ")
  Some(Resolver.url(name, new URL(url))(Resolver.ivyStylePatterns))
}

publishMavenStyle := false

credentials += Credentials("Github repos", "github.com", "qianyu668899", "qsjy81zwxy")