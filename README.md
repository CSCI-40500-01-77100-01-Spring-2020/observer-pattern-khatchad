# Observer-Pattern

The observer pattern implementation problem.

## Compiling the Project

The following command will compile the project *and* run the tests:

```bash
mvn clean verify
```

## Skipping Tests

```bash
mvn clean verify -DskipTests
```
## Creating the Javadoc API Documentation

```bash
mvn javadoc:javadoc
```

## Viewing the Javadoc API Documentation

Open the `index.html` file in the `target/site/apidocs` directory.

## Creating the Test Report

```bash
mvn jxr:test-jxr # this links test source code to the test results.
mvn javadoc:test-javadoc # this links API documentation to the test results.
mvn surefire-report:report
```

## Viewing the Report

Open the `surefire-report.html` file in the `target/site` directory.
