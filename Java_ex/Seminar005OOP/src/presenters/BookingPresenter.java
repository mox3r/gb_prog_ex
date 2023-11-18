package presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {
    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.view.registerObserver(this);
    }

    public void updateTableUI() {
        view.showTables(model.loadTables());
    }

    public void updateBookingUI() {
        view.showBookingOrders(model.loadTables());
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        System.out.println("Презентер реагирует!");
        System.out.println("Создание...");
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            view.showReservationTableResult(reservationNo);
        } catch (RuntimeException e) {
            view.showReservationTableResult(-1);
        }
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date date, int tableNo, String name) {
        System.out.println("Презентер реагирует!");
        System.out.println("Изменение...");

        int newReservationNumber;

        try {
            newReservationNumber = model.changeReservationTable(oldReservation, date, tableNo, name);
        } catch (Exception e) {
            System.out.println(e);
            newReservationNumber = -1;
        }

        view.showReservationTableResult(newReservationNumber);
    }
}
