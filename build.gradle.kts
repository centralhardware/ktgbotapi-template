plugins {
    kotlin("jvm") version "2.3.0"
    application
}

group = "me.centralhardware.telegram"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

val ktgbotapiVersion = "30.0.2"

dependencies {
    implementation("dev.inmo:tgbotapi:$ktgbotapiVersion")
    implementation("com.github.centralhardware:telegram-bot-commons:$ktgbotapiVersion")
//    implementation("com.github.centralhardware:ktgbotapi-restrict-access-middleware:$ktgbotapiVersion")
}

application {
    // Kotlin top-level main is compiled into MainKt in its package
    mainClass.set("me.centralhardware.telegram.MainKt")
}

tasks.test {
    useJUnitPlatform()
}