import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.7.22"
}

allprojects {
	group = "io.flashback"
	version = "0.0.1-SNAPSHOT"

	repositories {
		mavenCentral()
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "17"
		}
	}

	tasks.withType<JavaCompile> {
		sourceCompatibility = JavaVersion.VERSION_17.majorVersion
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}

subprojects {
	apply {
		plugin("org.jetbrains.kotlin.jvm")
		version = PluginVersion.KOTLIN_JVM
	}

	apply {
		plugin("org.jetbrains.kotlin.kapt")
		version = PluginVersion.KOTLIN_KAPT
	}

	dependencies {
		implementation(Dependencies.Kotlin.REFLECT)
		implementation(Dependencies.Kotlin.STDLIB_JDK8)
	}
}

tasks.withType<Jar> {
	enabled = true
}