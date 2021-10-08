# Minimal reproduction of issue with silently skipped tests

This repo is a minimal reproduction of a possible issue with JUnit 5 + Kotlin and silently skipped tests

See [src/test/kotlin/IssueTest.kt](src/test/kotlin/IssueTest.kt) for the demo of the issue.  When running the test
class, two unit tests should be ran but the JUnit report only shows 1 test running.  The other test method seems
to be silently skipped, regardless of whether it passes or fails.  
