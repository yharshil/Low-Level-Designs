package Booking;

import java.util.Date;
import java.util.List;

import CinemaHall.Audi;
import CinemaHall.Seat;
import CinemaHall.Show;
import User.Member;

public class Booking {

    String bookingID;
    Date bookingDate;
    Member member;
    Audi audi;
    Show show;
    BookingStatus bookingStatus;
    double totalAmount;
    List<Seat> seats;
    Payment paymentObj;

    public boolean makePayment(Payment payment) {
        return false;
    }

}
