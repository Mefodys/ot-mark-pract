plugins {
    kotlin("jvm")
}

dependencies {
//    testImplementation(kotlin("test-junit"))
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}