Q.1--> 1654. Ticket Booking System
    Geekoin60
    Medium
    Solved!
    Ticket Booking System
Problem Statement:
Write a program to calculate the fare of a ticket based on the travel type.
The program should use an abstract class Ticket with an abstract method calculateFare(). Subclasses BusTicket, TrainTicket, and FlightTicket override this method.
Fare per km:
Bus = 5
Train = 8
Flight = 15
Description:
The program should accept ticket type and distance in kilometers.
It should calculate and display the fare according to the ticket type.

Input Format:
A string (ticket type: bus/train/flight)
An integer (distance in km)

Output Format:
Ticket type
Fare

Sample Input:
bus
120
Sample Output:
Ticket Type: Bus Ticket
Fare: 600
Q.2--> 1658. Library Management System:-Library Management System
Problem Statement:
Create two interfaces: BookOperations (methods addBook(String book)) and UserOperations (methods borrowBook(String book)).
A class Library implements both.
Description:
The user first adds a book.
Another user borrows the book.
If the book is available, borrowing succeeds. Otherwise, a message should display "Book not available".

Input Format:
First line: Book name to add.
Second line: A command in the format: borrow <bookName>
Output Format:
Messages confirming whether the book was added or borrowed successfully.
Sample Input:
JavaProgramming
borrow JavaProgramming

Sample Output:
Book added: JavaProgramming
Book borrowed: JavaProgramming

Q.3:- 1657. Student Result Evaluation



Student Result Evaluation


Problem Statement:
Write a program that evaluates whether a student passes or fails based on marks and attendance. The program should use multiple inheritance with interfaces.

Define an interface Marks with method enterMarks(int marks).
Define an interface Attendance with method enterAttendance(int attendance).
Implement both interfaces in the Student class and provide a method checkResult() that checks:
Marks must be ≥ 40
Attendance must be ≥ 75%

If both conditions are met, display "Result: Pass", otherwise "Result: Fail".
Description:
The program accepts marks and attendance percentage as input.
Uses multiple inheritance (via interfaces).
Evaluates and prints result.

Input Format:
First line → Marks (integer)
Second line → Attendance percentage (integer)
Output Format:
"Result: Pass" or "Result: Fail"

Sample Input:
55
80
Sample Output:
Result: Pass