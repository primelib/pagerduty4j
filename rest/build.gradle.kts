plugins {
    `java-library`
    id("me.philippheuer.configuration")
}

projectConfiguration {
    artifactGroupId.set("io.github.primelib")
    artifactId.set("pagerduty4j-rest")
    artifactDisplayName.set("pagerduty4j-rest")
    artifactDescription.set("A Java Wrapper for the PagerDuty REST API")
}
