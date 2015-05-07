import com.typesafe.sbt.packager.SettingsHelper.makeDeploymentSettings

makeDeploymentSettings(Universal, packageBin in Universal, "zip")

enablePlugins(UniversalPlugin, SbtNativePackager)
//addPackage(Universal, packageZipTarball in Universal, "tgz")
