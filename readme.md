## Flashcard app

### Description
The flashcard app is created as a tool to practice for exams.

The backend is written in Kotlin with Spring and Gradle.
The database is Postgres SQL.
The front end is in React.


## Status

### Work in progress
 - Database
 - Frontend
 - Backend

### Done
 - none


## How to run

### Database
 - Install docker
 - Open a terminal in the ./docker file and use the following command ```docker compose -f db.yml up```
 - The connection information are in the db.yml file

### Backend
 - Install jdk-17
 - To build open a terminal in the ./app file and use the following command ```.\gradlew build```
 - To run the application use ```.\gradlew bootRun ```

### Frontend
 - Install node
 - To build open a terminal in the ./frontend file and use the following command ```npm install```
 - To run the application use ```npm run dev ```