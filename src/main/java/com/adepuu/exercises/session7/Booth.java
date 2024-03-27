package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Booth {
    HashMap<Event, ArrayList<UUID>> db;

    public Booth(Event[] events) {
        this.db = new HashMap<>();
        for (Event e: events) {
            db.put(e, new ArrayList<>());
        }
    }


    public Ticket bookTicket(Event event, String name) {
        UUID uuid = UUID.randomUUID();
        Ticket ticket = new Ticket(uuid, event, name);
        ArrayList<UUID> booked = db.get(event);
        booked.add(uuid);
        return ticket;
    }

    public void validateTicket(Ticket ticket) {
        try {
            ArrayList<UUID> tickets = db.get(ticket.getEvent());
            if (tickets.contains(ticket.getId())) {
                System.out.println(ticket);
                System.out.println("Enjoy your show!");
            } else {
                System.out.println("Invalid Ticket");
            }
        } catch (NullPointerException e) {
            System.out.println("Invalid Ticket");
        }

    }
}
