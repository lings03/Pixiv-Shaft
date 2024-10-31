plugins {
    id("java-library")
    id("org.jetbrains.kotlin.jvm") version "2.0.21"
    id("kotlin-kapt")
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    // 添加 KAPT 依赖
    kapt(project(":annotations"))
    compileOnly(project(":annotations"))

    // 添加注解处理器相关依赖
    kapt("com.google.auto.service:auto-service:1.1.1")
    annotationProcessor("com.google.auto.service:auto-service:1.1.1")

    // 添加 Java 注解处理 API 依赖
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("org.jetbrains:annotations:26.0.1")
}
