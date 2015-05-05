import com.typesafe.sbt.packager.SettingsHelper.makeDeploymentSettings
import com.typesafe.sbt.packager.SettingsHelper._

enablePlugins(UniversalPlugin)

makeDeploymentSettings(Universal, packageBin in Universal, "zip")
//commit1
//commit2
//addPackage(Universal, packageZipTarball in Universal, "tgz")
