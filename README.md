# Spring Cloud API Gateway with Netflix Eureka and User API

This application is a simple microservices demo that uses Spring Cloud API Gateway for routing requests, Netflix Eureka for service discovery, and a User API service that handles user-related requests.

## Table of Contents
1. [Features](#features)
2. [Technologies Used](#technologies-used)
3. [Installation](#installation)
4. [Usage](#usage)
5. [Contribute](#contribute)
6. [License](#license)

## Features

- API Gateway - A single entry point for all client requests, which then routes requests to appropriate microservices.
- User API Service - Handles user-related operations, such as creating a new user and user login.
- Service Discovery - Enables microservices to find and communicate with each other without hardcoding hostname and port.

## Technologies Used

- [Spring Cloud](https://spring.io/projects/spring-cloud)
- [Netflix Eureka](https://spring.io/guides/gs/service-registration-and-discovery/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Java](https://www.oracle.com/java/)

## Installation

Please ensure that you have Java and Maven installed on your machine before you proceed.

Clone the repository:

git clone https://github.com/yourusername/your-repo-name.git



Move into the project directory:

`cd your-repo-name`


Build the project:

`mvn clean install`


## Usage

Start the Eureka service:

`cd eureka-service
mvn spring-boot:run`

Start the API Gateway:

`cd api-gateway
mvn spring-boot:run`

Start the User API Service:

`cd user-api-service
mvn spring-boot:run`

The User API Service can now be accessed via the API Gateway. Here are some example endpoints:

- `http://localhost:8020/users/status` - Checks the status of the User API Service.
- `http://localhost:8020/users/create` - Creates a new user.
- `http://localhost:8020/users/login` - Authenticates a user.

## Contribute

We would love for you to contribute to this project! Please feel free to open a new issue or submit a pull request.

## License

[MIT](https://choosealicense.com/licenses/mit/)