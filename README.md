# sleuth-zipkin-example

This project is an example implementation of distributed logging with [Spring Cloud Sleuth](https://spring.io/projects/spring-cloud-sleuth) and [Zipkin](https://zipkin.io/).

## Getting Started

### Prerequisites

* [Java 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
* [Maven](https://maven.apache.org/)
* [Docker](https://www.docker.com/)

### Running the example

1. Run ```docker-compose up``` in the project's root folder.
This will pull the [official Zipkin Docker image](https://registry.hub.docker.com/r/openzipkin/zipkin) and run it in a Docker container.
Once the container is up and running, the Zipkin server will be available under http://localhost:9411/zipkin
2. Open another new terminal and ```cd order-service```.
3. Run ```mvn spring-boot:run``` from the command line. This will start the order service under this URL: http://localhost:8080/
4. Open a new terminaml and ```cd customer-service```.
5. Run ```mvn spring-boot:run``` from the command line. This will start the customer service under this URL: http://localhost:8081/
6. Open yet another terminal and execute this cURL command: ```curl -X POST http://localhost:8080/```. 
This will yield this response: ```{"orderID":"1","customerID":"1"}```

Now you should be able to search for distributed log traces under http://localhost:9411/zipkin.

These log traces will include Spring Cloud Sleuth trace IDs (for identifying an entire process) and span IDs (for identifying single steps in that process).

## Running the build

Run ```mvn clean install``` from the command line.

## Built With

* [Spring Boot](https://projects.spring.io/spring-boot/)
* [Spring Cloud Sleuth](https://spring.io/projects/spring-cloud-sleuth)
* [Zipkin](https://zipkin.io/)
* [Maven](https://maven.apache.org/)
* [Docker](https://www.docker.com/)

## License

MIT License

## Authors

* **[Björn Wilmsmann](https://bjoernkw.com)**
