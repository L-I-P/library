group = "org.mail"
version = "1.0-SNAPSHOT"

tasks.register<JavaExec>("startMainClass") {
    mainClass.set( "gradle.example.Main")

}