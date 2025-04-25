# Spring Boot Student Management API

This repository contains a Spring Boot application for managing students and courses. It provides RESTful API endpoints for CRUD operations on student and course entities.

## Project Structure

The project is organized into the following packages:

- `lk.ac.vau.fas.ict.model`: Contains entity classes like Student and Course
- `lk.ac.vau.fas.ict.controller`: Contains REST controllers for handling HTTP requests

## Main Components

### Models

1. **Student**: Represents a student with properties like registration number, name, age, course, and GPA
2. **Course**: Represents a course with properties like code, name, and credits

### Controllers

1. **AppController**: Manages student-related operations
   - Provides endpoints for retrieving, adding, updating, and deleting student records
   - Uses a HashMap for efficient student lookup by registration number

2. **ClassController**: Manages course-related operations
   - Extends the generic CRUDController for basic CRUD operations
   - Pre-populated with sample course data

3. **CRUDController**: A generic controller providing basic CRUD operations
   - Implemented as a generic class that can work with different entity types
   - Provides methods for retrieving, adding, updating, and deleting records

## API Endpoints

### Student Endpoints
- `GET /app/students/{regNo}`: Returns a specific student by registration number

     ![Screenshot (1044)](https://github.com/user-attachments/assets/63025bdc-eeb9-481a-93f7-1163a2c50ff7)

- `POST /app/add`: Adds a new student
  
     ![Screenshot (1051)](https://github.com/user-attachments/assets/c1fe4552-e28e-40d0-8c40-5526a487762d)

     ![Screenshot (1050)](https://github.com/user-attachments/assets/59aa4923-6297-446a-8232-1e37d0d0af98)


- `DELETE /app/students/{id}`: Deletes a student by registration number

    ![Screenshot (1046)](https://github.com/user-attachments/assets/618cc1f1-457a-4953-9115-734aa330e6b3)

   ![Screenshot (1047)](https://github.com/user-attachments/assets/6e122ce3-5540-4a8e-bdcc-1f414794393f)

  
- `PUT /app/students/{id}`: Updates a student by registration number

    ![Screenshot (1048)](https://github.com/user-attachments/assets/5fe7e626-d516-4513-81e7-8559a1ae95e5)

   ![Screenshot![Screenshot (1050)](https://github.com/user-attachments/assets/43b15d7c-7cb7-4336-90b8-11b018c4e99f)

   ![Screenshot (1049)](https://github.com/user-attachments/assets/aa64c29a-2ff3-4cec-86fa-52ce670d6a51)



### Course Endpoints

- `GET /course/`: Returns all courses

   ![Screenshot (1056)](https://github.com/user-attachments/assets/a3a2797d-d13d-498a-917b-3bc6bd3b82a7)

- `POST /course/add/{id}`: Adds a new course

     ![Screenshot (1057)](https://github.com/user-attachments/assets/0d846830-3d6a-489d-8406-6ef2b8f6fa8c)

     ![Screenshot (1058)](https://github.com/user-attachments/assets/5f5ef4fe-2046-42b5-9f00-0a73524a3aab)

  
- `DELETE /course/delete/{id}`: Deletes a course by code

    ![Screenshot (1061)](https://github.com/user-attachments/assets/11f2b912-b633-4245-a10f-4f642d5cbf49)
  
    ![Screenshot (1062)](https://github.com/user-attachments/assets/ec2f9051-62a8-4d18-8439-a8216db89524)

- `PUT /course/update/{id}`: Updates a course by code
  
    ![Screenshot (1059)](https://github.com/user-attachments/assets/0646b3f0-7ce0-4d9e-b9c4-ec261510fff0)

    ![Screenshot (1060)](https://github.com/user-attachments/assets/a955b833-d847-4ab1-b095-c28bc2a76440

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later
- Maven or Gradle
- Spring Boot

### Running the Application

1. Clone the repository
2. Navigate to the project directory
3. Run `mvn spring-boot:run` or `./gradlew bootRun` depending on your build tool
4. Access the API at `http://localhost:8080`

## Sample Data

The application is pre-populated with sample data:

- 5 student records with varying details
- 3 course records (E-Commerce, Web Service And Server Technology, Web Application Development)
