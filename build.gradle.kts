import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.0" apply false
	id("io.spring.dependency-management") version "1.1.0"
	id("com.netflix.dgs.codegen") version "5.9.0" apply false
	kotlin("jvm") version "1.8.21"
	kotlin("plugin.spring") version "1.8.21"
}

allprojects {
	group = "com.example"
	version = "0.0.1-SNAPSHOT"

	apply(plugin = "java")
	java.sourceCompatibility = JavaVersion.VERSION_17

	apply(plugin = "org.jetbrains.kotlin.jvm")
	apply(plugin = "io.spring.dependency-management")

	repositories {
		mavenCentral()
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "17"
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}


tasks.withType<com.netflix.graphql.dgs.codegen.gradle.GenerateJavaTask> {
	packageName = "com.example.demo.schema"
	language = "java"
}
