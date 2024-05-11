# Employee and Address Management System

## Overview

The Employee and Address Management System is a Spring Boot web application that allows users to manage employees and their associated addresses. It provides CRUD (Create, Read, Update, Delete) operations for both employees and addresses. The project includes controllers, services, models, repositories, and configuration files.

## Project Structure

### Controllers
- **EmployeeController**: Defines APIs for managing employees.
- **AddressController**: Defines APIs for managing addresses.

### Models
- **Employee**: Represents an employee entity with first name, last name, and associated address.
- **Address**: Represents an address entity with street, city, state, and zip code.

### Repositories
- **EmployeeRepo**: Handles CRUD operations for employees.
- **AddressRepo**: Handles CRUD operations for addresses.

### Services
- **EmployeeService**: Provides methods for managing employees.
- **AddressService**: Provides methods for managing addresses.

### Main Application Class
- **EmployeeAndAddressApplication**: Entry point of the application. It bootstraps the Spring Boot application and starts the embedded Tomcat server.

## Running the Application
To run the application:
1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd Employee-And-Address`
3. Run the application: `mvn spring-boot:run`

## Configuration
The application uses MySQL as the database. The default configurations can be found in the `application.properties` file. Ensure that MySQL is installed and running on the specified port.

## Dependencies
- Spring Boot Web
- Spring Data JPA

## Endpoints

### EmployeeController
- **GET /employees**: Retrieves all employees.
- **GET /employees/{id}**: Retrieves an employee by ID.
- **POST /employees**: Creates a new employee.
- **PUT /employees/{id}**: Updates an existing employee.
- **DELETE /employees/{id}**: Deletes an employee.

### AddressController
- **GET /addresses**: Retrieves all addresses.
- **GET /addresses/{id}**: Retrieves an address by ID.
- **POST /addresses**: Creates a new address.
- **PUT /addresses/{id}**: Updates an existing address.
- **DELETE /addresses/{id}**: Deletes an address.

## Usage
1. Retrieve all employees by sending a GET request to `/employees`.
2. Retrieve a specific employee by sending a GET request to `/employees/{id}`.
3. Create a new employee by sending a POST request to `/employees` with the employee details in the request body.
4. Update an existing employee by sending a PUT request to `/employees/{id}` with the updated employee details in the request body.
5. Delete an employee by sending a DELETE request to `/employees/{id}`.

Similar operations can be performed for addresses using the `/addresses` endpoints.

## Documentation
API documentation is not provided in this project, but code comments have been added for clarity and maintenance purposes.
## Additional Notes

### External Configuration
- The server port and database connection details are configured in the `application.properties` file.

### Security
- Security features such as authentication and authorization are not implemented in this version of the application.

### Error Handling
- Error handling mechanisms for handling exceptions and providing meaningful error responses are not included in this version.

### Testing
- Unit tests and integration tests for controllers, services, and repositories are not implemented in this version.

### Logging
- Logging configurations for application logs are not included in this version.
