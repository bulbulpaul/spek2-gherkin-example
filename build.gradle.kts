plugins {
    kotlin("jvm") version "1.4.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    val spekVersion = "2.0.13"
    implementation(kotlin("stdlib"))
    implementation(kotlin("test"))
    implementation(kotlin("reflect"))
    testRuntimeOnly("org.spekframework.spek2:spek-runner-junit5:$spekVersion")
    testImplementation("org.spekframework.spek2:spek-dsl-jvm:$spekVersion")
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.2")
    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.5.2")
}

tasks.withType<Test> {
    useJUnitPlatform {
        includeEngines("spek2")
    }
}