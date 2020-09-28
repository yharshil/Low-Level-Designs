package User;

import java.util.List;

import Booking.Booking;

public class Member extends SystemMember {
    
    public Booking makeBooking(Booking booking){
        return booking;
    }

    public List<Booking> getBooking() {
        return null; 
    }

}
