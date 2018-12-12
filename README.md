# maven-app-it
This repository describes some best practices to use while incorporating integration test to a maven application. 

## How to run unit test
mvn test

## How to run integration test
mvn clean verify -P integration-test

## How to run verify phase with only unit test cases.
mvn clean verify
