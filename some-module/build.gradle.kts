

apply(plugin = "com.netflix.dgs.codegen")
apply(plugin = "org.springframework.boot")
apply(plugin = "org.jetbrains.kotlin.plugin.spring")

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter:7.0.0")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

configure<org.springframework.boot.gradle.dsl.SpringBootExtension> {
    buildInfo()
}

tasks.withType<org.springframework.boot.gradle.tasks.bundling.BootJar> {
    manifest {
        attributes("Implementation-Version" to project.version as String)
    }
    mainClass.set("com.example.demo.DemoDgsTestsApplication")
}

tasks.withType<com.netflix.graphql.dgs.codegen.gradle.GenerateJavaTask> {
    packageName = "com.example.demo.schema"
    language = "java"
}
