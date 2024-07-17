plugins {
    kotlin("jvm") version "1.8.21"
    id("org.jlleitschuh.gradle.ktlint") version "10.3.0"
    id("org.sonarqube") version "4.3.1.3277"
    id("jacoco")
}

group = "me.jchoi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter", "5.9.3")
    testImplementation("org.assertj", "assertj-core", "3.22.0")
    testImplementation("io.kotest", "kotest-runner-junit5", "5.6.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    test {
        useJUnitPlatform()
        finalizedBy(jacocoTestReport) // report is always generated after tests run
    }
    ktlint {
        verbose.set(true)
    }
    jacocoTestReport {
        dependsOn(test) // tests are required to run before generating the report
        reports {
            xml.required.set(true)
        }
    }
}

sonar {
    properties {
        property("sonar.projectKey", "namonak_1d1kotlin")
        property("sonar.organization", "namonak")
        property("sonar.host.url", "https://sonarcloud.io")
        property("sonar.coverage.exclusions", "src/main/kotlin/boj/problems/Main.kt")
    }
}
