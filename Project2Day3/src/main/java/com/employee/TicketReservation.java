package com.employee;

import java.util.*;

public class TicketReservation {
    private static final int CONFIRMEDLIST_LIMIT = 3;
    private static final int WAITINGLIST_LIMIT = 1;

    private List<Passenger> confirmedList = new ArrayList<>();
    private Deque<Passenger> waitingList = new ArrayDeque<>();

    public boolean bookFlight(String firstName, String lastName, int age, String gender, String travelClass, String confirmationNumber) {
        Passenger passenger = new Passenger(firstName, lastName, gender,age, travelClass, confirmationNumber);

        if (confirmedList.size() < CONFIRMEDLIST_LIMIT) {
            confirmedList.add(passenger);
            return true;
        } else if (waitingList.size() < WAITINGLIST_LIMIT) {
            waitingList.offer(passenger);
            return true;
        }
        return false;
    }

    public boolean cancel(String confirmationNumber) {
        if (removePassenger(confirmedList.iterator(), confirmationNumber)) {
            if (!waitingList.isEmpty()) {
                confirmedList.add(waitingList.poll());
            }
            return true;
        } else if (removePassenger(waitingList.iterator(), confirmationNumber)) {
            return true;
        }
        return false;
    }

    public boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {
        while (iterator.hasNext()) {
            if (iterator.next().getConfirmationNumber().equals(confirmationNumber)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Passenger> getConfirmedList() {
        return confirmedList;
    }
    public Deque<Passenger> getWaitingList() {
        return waitingList;
    }
}
