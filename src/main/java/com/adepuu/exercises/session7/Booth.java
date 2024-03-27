package com.adepuu.exercises.session7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Booth {
    HashMap<String, Integer> slots;
    HashMap<String, ArrayList<UUID>> db;

    public Booth() {
        this.db = new HashMap<>() {{put("Radiohead", new ArrayList<UUID>());}};
    }

    public Ticket bookTicket() {
        UUID uuid = UUID.randomUUID();
        Ticket ticket = new Ticket(uuid, "Radiohead", "Sheva", 90);
        ArrayList<UUID> booked = db.get("Radiohead");
        booked.add(uuid);
        return ticket;
    }

    public void validateTicket(Ticket ticket) {
        ArrayList<UUID> tickets = db.get("Radiohead");
        if (tickets.contains(ticket.getId())) {
            System.out.println(ticket);
            System.out.println("Enjoy your show!");
        } else {
            System.out.println("Invalid Ticket");
        }
    }
}
