plugins {
    application
}

application {
    mainClass.set("org.mail.controller.Application")
}

group = "org.mail"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":models"))
    implementation("com.intellij:annotations:12.0")
    implementation("org.projectlombok:lombok:1.18.20")
    implementation("com.google.code.gson:gson:2.8.8")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}