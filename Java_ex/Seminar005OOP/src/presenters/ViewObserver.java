package presenters;

import java.util.Date;

public interface ViewObserver {
    void onReservationTable(Date orderDate, int tableNo, String name);
    void onChangeReservationTable(int oldReservation, Date date, int tableNo, String name);       
}
