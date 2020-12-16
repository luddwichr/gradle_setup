# What

This project demonstrates how to set up a gradle project with a dedicated source set for integration tests.

# Why

https://softwareengineering.stackexchange.com/a/340375

# How

https://docs.gradle.org/current/userguide/java_testing.html#sec:configuring_java_integration_tests
''
# Alternative

The `@Tag` annotation supported by Junit 5 can be used instead. It allows for closer locality of unit and integration
tests (i.e. in same directory). Also, this option is generally more flexible, if more than just the two categories unit
test and integration test should be run separately (e.g. acceptance or performance tests).
See https://mkyong.com/junit5/junit-5-tagging-and-filtering-tag-examples/ for how to set things with tags.
