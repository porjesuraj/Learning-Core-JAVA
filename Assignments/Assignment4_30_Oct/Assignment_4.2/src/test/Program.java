package test;

import java.util.Scanner;

public class Program {
	
	
	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		Customer c4 = new Customer();
		Customer c5 = new Customer();
		Customer c6 = new Customer();
		Customer c7 = new Customer();
		Customer c8 = new Customer();
		Customer c9 = new Customer();
		Customer c10 = new Customer();
		Customer c11 = new Customer();
		
		CustomerTest test = new CustomerTest();
		
		test.getFlightReservation(c1);
		test.getFlightReservation(c2);

		test.getFlightReservation(c3);

		test.getFlightReservation(c4);

		test.getFlightReservation(c5);

		test.getFlightReservation(c6);

		test.getFlightReservation(c7);

		test.getFlightReservation(c8);

		test.getFlightReservation(c9);

		test.getFlightReservation(c10);
		test.getFlightReservation(c11);

		
	}

}

/* Q.2 (Airline Reservations System)
A small airline has just purchased a computer for its new
automated reservations system. You’ve been asked to develop the
new system. You’re to write an application to assign seats on
each flight of the airline’s only plane (capacity: 10 seats).
Your application should display the following alternatives:
Please type 1 for First Class and Please type 2 for Economy.
If the user types 1, your application should assign a seat in
the firstclass section (seats 1–5). If the user types 2, your
application should assign a seat in the economy section (seats
6–10). Your application should then display a boarding pass
indicating the person’s seat number and whether it’s in the
first-class or economy section of the plane.
Use a one-dimensional array of primitive type boolean to
represent the seating chart of the plane. Initialize all the
elements of the array to false to indicate that all the seats
are empty. As each seat is assigned, set the corresponding
element of the array to true to indicate that the seat is
no longer available.
Your application should never assign a seat that has already
been assigned. When the economy section is full, your
application should ask the person if it’s acceptable to be
placed in the first-class section (and vice versa). If yes, make
the appropriate seat assignment. If no, display the message
"Next flight leaves in 3 hours."
 */