package com.adepuu.exercises.session7;

import java.util.UUID;

public class Ticket implements Ticketable{
    private UUID id;
    private String event;
    private String name;
    private int price;

    private static int slot = 0;

    public Ticket(UUID id, String event, String name, int price) {
        if (slot != 0) {
            this.id = id;
            this.event = event;
            this.name = name;
            this.price = price;
            slot--;
        }

    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId().toString() + "\nEvent: " + this.getEvent() + "\nName: " + this.getName();
    }
}
