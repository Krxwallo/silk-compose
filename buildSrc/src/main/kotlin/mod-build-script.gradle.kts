plugins {
    kotlin("jvm")
    id("fabric-loom")
}

val excludedDeps: Configuration by configurations.creating

dependencies {
    minecraft("com.mojang:minecraft:$minecraftVersion")
    mappings(loom.layered {
        //mappings("net.fabricmc:yarn:1.19+build.4")
        officialMojangMappings()
    })
    excludedDeps(modImplementation("net.fabricmc:fabric-loader:0.14.19")!!)
    excludedDeps(modImplementation("net.fabricmc.fabric-api:fabric-api:0.78.0+1.19.4")!!)
    excludedDeps(modImplementation("net.fabricmc:fabric-language-kotlin:1.9.3+kotlin.1.8.20")!!)
}
