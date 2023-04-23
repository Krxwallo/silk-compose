plugins {
    `mod-build-script`
    id("org.jetbrains.compose")
}

description = "Testmod for Silk Compose"

dependencies {
    modImplementation("net.silkmc:silk-commands:1.9.8")
    modImplementation("net.silkmc:silk-compose:1.0.5")

    implementation("com.godaddy.android.colorpicker:compose-color-picker-jvm:0.5.0")
}
