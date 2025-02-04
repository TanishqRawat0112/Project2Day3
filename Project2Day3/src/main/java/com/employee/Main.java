package com.employee;

import java.util.Deque;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("------Project 2 ------");

        TicketReservation ticketReservation = new TicketReservation();
        boolean isBooked = ticketReservation.bookFlight("Tanishq","Rawat",21,"Male","Business","A30");
        if(isBooked) {
            System.out.println("Passenger 1 Booked");
        }
        else {
            System.out.println("Passenger 1 Not Booked");
        }

        isBooked = ticketReservation.bookFlight("Tanishq","Rawat",21,"Male","Business","A31");
        if(isBooked) {
            System.out.println("Passenger 2 Booked");
        }
        else {
            System.out.println("Passenger 2 Not Booked");
        }

        isBooked = ticketReservation.bookFlight("Tanishq","Rawat",21,"Male","Business","A32");
        if(isBooked) {
            System.out.println("Passenger 3 Booked");
        }
        else {
            System.out.println("Passenger 3 Not Booked");
        }

        isBooked = ticketReservation.bookFlight("Tanishq","Rawat",21,"Male","Business","A34");
        if(isBooked) {
            System.out.println("Passenger 4 Booked");
        }
        else {
            System.out.println("Passenger 4 Not Booked");
        }

        System.out.println("Confirmed List : ");
        List<Passenger> confirmedList = ticketReservation.getConfirmedList();
        for(Passenger passenger : confirmedList) {
            System.out.println(passenger.firstName + " " + passenger.lastName);
            System.out.println(passenger.getConfirmationNumber());
        }
        System.out.println("Waiting List : ");
        Deque<Passenger> waitingList = ticketReservation.getWaitingList();
        for(Passenger passenger : waitingList) {
            System.out.println(passenger.firstName + " " + passenger.lastName);
            System.out.println(passenger.getConfirmationNumber());
        }

        System.out.println("After First Cancellation : ");

        boolean isCanceled = ticketReservation.cancel("A32");
        if(isCanceled) {
            System.out.println("Passenger 3 canceled");
        }
        else {
            System.out.println("Passenger 3 not canceled");
        }
        System.out.println("Confirmed List : ");
        confirmedList = ticketReservation.getConfirmedList();
        for(Passenger passenger : confirmedList) {
            System.out.println(passenger.firstName + " " + passenger.lastName);
            System.out.println(passenger.getConfirmationNumber());
        }
        System.out.println("Waiting List : ");
        waitingList = ticketReservation.getWaitingList();
        for(Passenger passenger : waitingList) {
            System.out.println(passenger.firstName + " " + passenger.lastName);
            System.out.println(passenger.getConfirmationNumber());
        }



        isBooked = ticketReservation.bookFlight("Tanishq","Rawat",21,"Male","Business","A32");
        if(isBooked) {
            System.out.println("Passenger 3 Booked");
        }
        else {
            System.out.println("Passenger 3 Not Booked");
        }

        isCanceled = ticketReservation.cancel("A32");
        System.out.println("After Second Cancellation : ");

        if(isCanceled) {
            System.out.println("Passenger 3 canceled");
        }
        else {
            System.out.println("Passenger 3 not canceled");
        }

        System.out.println("Confirmed List : ");
        confirmedList = ticketReservation.getConfirmedList();
        for(Passenger passenger : confirmedList) {
            System.out.println(passenger.firstName + " " + passenger.lastName);
            System.out.println(passenger.getConfirmationNumber());
        }
        System.out.println("Waiting List : ");
        waitingList = ticketReservation.getWaitingList();
        for(Passenger passenger : waitingList) {
            System.out.println(passenger.firstName + " " + passenger.lastName);
            System.out.println(passenger.getConfirmationNumber());
        }

        System.out.println("------End Of Program ------");
    }
}