package views;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import models.Table;
import presenters.View;
import presenters.ViewObserver;

public class BookingView implements View {

    private Collection<ViewObserver> observers = new ArrayList<>();

    @Override
    public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
        System.out.println("-".repeat(30));
    }

    @Override
    public void registerObserver(ViewObserver observer) {
        observers.add(observer);
    }

    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик забронирован! Резерв №%d\n", reservationNo);
            System.out.println("-".repeat(30));
        } else {
            System.out.println("Ошибка бронирования. Попробуйте позже");
            System.out.println("*".repeat(30));
        }

    }

    
    public void reservationTable(Date orderDate, int tableNo, String name) {
        System.out.println("Событие регистрации возбуждается!");
        System.out.println("Происходит рассылка...");
        for (ViewObserver observer : observers) {
            observer.onReservationTable(orderDate, tableNo, name);
        }
    }

    public void changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name){
        System.out.println("Событие изменения возбуждается!");
        System.out.println("Происходит рассылка...");
        for (ViewObserver observer : observers) {
            observer.onChangeReservationTable(oldReservation, orderDate, tableNo, name);
        }
    }


}
