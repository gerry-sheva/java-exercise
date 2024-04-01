package com.adepuu.exercises.session10;

public class Magazine extends Reading{
    private String printDate;

    public Magazine(int stock, int pages, String title, String author, String printDate) {
        super(stock, pages, title, author);
        this.printDate = printDate;
    }

    @Override
    public void printStatus() {
        System.out.printf("This %s magazine was first printed at %s\n", this.title, this.printDate);
        super.printStatus();
    }
}
