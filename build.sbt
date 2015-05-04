import com.typesafe.sbt.packager.SettingsHelper.makeDeploymentSettings
import com.typesafe.sbt.packager.SettingsHelper._

enablePlugins(UniversalPlugin)

makeDeploymentSettings(Universal, packageBin in Universal, "zip")

//addPackage(Universal, packageZipTarball in Universal, "tgz")