plugins {
    kotlin("jvm") version "2.0.20"
    idea
    java
    `maven-publish`
    id("io.papermc.paperweight.userdev") version "1.7.3"
    id("io.github.goooler.shadow") version "8.1.7"
}

group = "dev.blacky"
version = "1.0.0"
paperweight.reobfArtifactConfiguration = io.papermc.paperweight.userdev.ReobfArtifactConfiguration.MOJANG_PRODUCTION

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
    maven("https://repo.codemc.io/repository/maven-releases/")
    maven("https://nexus.lucko.me/")
    maven("https://repo.dmulloy2.net/repository/public/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    paperweight.paperDevBundle("1.21.1-R0.1-SNAPSHOT")
    compileOnly("com.comphenix.protocol:ProtocolLib:5.1.0")
    implementation("net.kyori:event-api:3.0.0")
}

tasks {
    build {
        dependsOn(shadowJar)
    }

    shadowJar {
        archiveClassifier.set("")

        relocate("net.kyori.event", "me.lucko.helper.libs.kyori.event")

        dependencies {
            exclude(dependency("org.jetbrains.kotlin:kotlin-stdlib:.*"))
            exclude(dependency("com.google.*:.*:.*")) // server already includes this
        }
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

idea {
    module {
        isDownloadJavadoc = true
        isDownloadSources = true
    }
}

publishing {
    // Simple publication to maven local
    publications {
        create<MavenPublication>("maven") {
            artifactId = project.name
            group = project.group.toString()
            version = project.version.toString()

            from(components["java"])
        }
    }
}
