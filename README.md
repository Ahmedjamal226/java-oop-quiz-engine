Java Console Quiz Engine


A robust, terminal-based quiz application built to demonstrate Core Java and Object-Oriented Programming (OOP) fundamentals. This project follows a clean separation of concerns by decoupling data models from business logic.

🚀 Key Features
Encapsulated Data Model: Uses a dedicated Question class with private attributes and public getters/setters.
Service-Oriented Architecture: Logic is centralized in a Question_service class to manage state and scoring.
Dynamic Scoring: Real-time comparison between user input and the object-stored correct answers.
Memory Efficient: Utilizes a custom constructor to initialize the data factory once per session.

🛠️ Technical Implementation
Language: Java 17+
Pattern: Model-Service Architecture
Concepts Used:
Encapsulation: Protecting data integrity.
Arrays of Objects: Managing complex data structures.
Constructor Chaining: Ensuring objects are ready upon instantiation.
Scanner API: Handling real-time user interaction.


📂 Project Structure
Main.java: The entry point that triggers the service.
Question.java: The POJO (Plain Old Java Object) defining the question structure.
Question_service.java: The "Brain" containing the arrays, loops, and scoring logic.


📖 How to Run
Clone the repository.
Compile the files: javac quiz_console_app/*.java
Run the application: java quiz_console_app.Main


Developed as part of a Core Java Mastery path, focusing on scalable software design.
