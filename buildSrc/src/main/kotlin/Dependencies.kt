object Dependencies {
    object Kotlin {
        const val REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
        const val STDLIB_JDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    }

    object Javax {
        const val SERVLET = "javax.servlet:javax.servlet-api:${DependencyVersion.JAVAX_SERVLET}"
    }

    object Spring {
        const val TEST = "org.springframework.boot:spring-boot-starter-test"
    }
}

private object DependencyVersion {
    const val JAVAX_SERVLET = "4.0.1"
}