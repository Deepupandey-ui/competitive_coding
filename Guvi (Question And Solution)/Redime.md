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