package presenters;

import java.util.Collection;

import models.Table;

public interface View {
    void showTables(Collection<Table> tables);
    void registerObserver(ViewObserver observer);
    void showReservationTableResult(int reservationNo);
}
