 # Java Calculator Test Runner with Docker

This project runs JUnit tests for a Calculator class using Docker.

## Prerequisites
- Docker Desktop installed
- Java source files (`Calculator.java`, `TestAdd.java`, `TestSub.java`)
- JUnit 4.12 jar


## Building and Running

1. Build the Docker image:
    docker build -t openjdk .
2. Running the tests:
   docker run --rm openjdk
