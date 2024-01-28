import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.google.protobuf.gradle.id

plugins {
    id("org.springframework.boot") version "3.2.1"
    id("io.spring.dependency-management") version "1.1.4"
    id("com.google.protobuf") version "0.9.4"
    kotlin("jvm") version "1.9.21"
    kotlin("plugin.spring") version "1.9.21"
    kotlin("plugin.jpa") version "1.9.21"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

apply(plugin = "com.google.protobuf")

group = "com.coffee"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

val grpcVersion = "1.59.0"
val protobufVersion = "3.21.7"
val protocVersion = protobufVersion

sourceSets {
    main {
        java {
            srcDir("src/main/generatedProto")
        }
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.vladmihalcea:hibernate-types-52:2.10.4")

    // liquibase
    implementation("org.liquibase:liquibase-core")

    // gRPC
    implementation("io.grpc:grpc-protobuf:$grpcVersion")
    implementation("io.grpc:grpc-stub:$grpcVersion")
    runtimeOnly("com.h2database:h2")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

protobuf {
    protoc { artifact = "com.google.protobuf:protoc:$protocVersion" }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:$grpcVersion"
        }
    }

    generateProtoTasks {
        ofSourceSet("main").forEach { task ->
            task.builtins {
                all().forEach {
                    it.plugins {
                        id("grpc")
                    }
                }
            }
        }
        setGeneratedFilesBaseDir("$projectDir/src/generatedProto")
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs += "-Xjsr305=strict"
            jvmTarget = "17"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}