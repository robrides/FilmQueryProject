### Film Query Project

### Week 6 - Homework for Skill Distillery

#### Overview

* Program Purpose
  * This project incorporates the Data Access Object enabling the Java application to interact with a MySQL database. The database consists of 14 tables requiring join queries to properly retrieve relevant data.

#### UML Diagram

![UML Diagram](https://github.com/robrides/FilmQueryProject/blob/master/Model.jpg)

#### How to use this project
  * First obtain a copy of the database from Skill Distillery. With the database running on the local machine, compile the project.  Run the application using the FilmQueryApp file. At the console, the user is presented with a menu of options to select.  Follow the console prompts to navigate through the application.

#### Concepts and Technologies Used

  * Object-Oriented Design, abstraction, polymorphism, inheritance, encapsulation, interfaces, Java IO, Java Data Access Object, MySQL, Maven Project Object Model, Eclipse, Git, DRY

#### Lessons Learned

  * Test SQL queries against the database prior to placing them in the application.  Check for null lists before trying to print them. Ensure the database is running.  The first call to the RecordSet.next() method gets you into the record set.  The next call returns a record so ensure you are not checkinig twice before using the result.
