import java.util.Date;

import models.TableModel;
import presenters.BookingPresenter;
import views.BookingView;

public class App {
    public static void main(String[] args) throws Exception {
        TableModel tableModel = new TableModel();
        BookingView bookingView = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(tableModel, bookingView);

        bookingPresenter.updateTableUI();
        bookingView.reservationTable(new Date(), 3, "Andrew");
        bookingView.reservationTable(new Date(), 3, "Sarah");
        bookingView.reservationTable(new Date(), 2, "Misha");
        bookingView.reservationTable(new Date(), 1, "Andrew");
        bookingView.changeReservationTable(1001, new Date(), 3, "Andrew");
        bookingView.changeReservationTable(1019, new Date(), 3, "Andrew");

        bookingPresenter.updateBookingUI();
    }
}
