import com.typesafe.sbt.packager.SettingsHelper.makeDeploymentSettings

enablePlugins(UniversalPlugin)

enablePlugins(SbtNativePackager)

makeDeploymentSettings(Universal, packageBin in Universal, "zip")

//addPackage(Universal, packageZipTarball in Universal, "tgz")
