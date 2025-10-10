import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.9.24"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
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
    testImplementation("org.jetbrains.kotlin:kotlin-reflect:1.9.24")
}

/** JDK 21 일관성 보장 */
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}
kotlin {
    jvmToolchain(21)
}

/** Kotlin 컴파일러 타깃 21 지정 */
tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(JvmTarget.JVM_21)
    }
}

/** ktlint 설정(플러그인 확장) */
ktlint {
    verbose.set(true)
    // 코어 ktlint 버전
    version.set("1.2.1")
    filter {
        exclude("**/build/**", "**/generated/**", "**/out/**")
        include("**/src/**/*.kt", "**/src/**/*.kts")
    }
}

/** JaCoCo: JDK 21 지원 버전 */
jacoco {
    toolVersion = "0.8.11"
}

tasks {
    test {
        useJUnitPlatform()
        finalizedBy(jacocoTestReport) // 테스트 후 리포트 생성
    }
    jacocoTestReport {
        dependsOn(test)
        reports {
            xml.required.set(true) // SonarCloud에서 필요
            // html.required.set(true) // 로컬에서 보고 싶으면 주석 해제
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
