package models;

import java.util.Date;

public class Reservation {
    private static int counter = 1000;
    private final int id;
    private final Table table;
    private Date date;
    private String name;

    public Reservation(Table table, Date reservationDate, String name) {
        this.date = reservationDate;
        this.name = name;
        this.table = table;
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public Table getTable() {
        return table;
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
