package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import presenters.Model;

public class TableModel implements Model {
    private Collection<Table> tables;

    @Override
    public Collection<Table> loadTables() {
        if (tables == null) {
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            if (table.getNo() == tableNo) {
                Reservation reservation = new Reservation(table, reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        throw new RuntimeException("Не корректный номер. Не удалось забронировать!");
    }

    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table : loadTables()) {
            for (Reservation reservation : table.getReservations()) {
                if (reservation.getId() == oldReservation) {
                    // table.getReservations().remove(reservation);
                    System.out.println("Резерв прекращен.");
                    return reservationTable(reservationDate, tableNo, name);
                } 
            }
        }
        throw new RuntimeException("Неверный номер бронирования");

    }

}
