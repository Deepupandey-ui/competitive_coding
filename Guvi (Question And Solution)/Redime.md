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

