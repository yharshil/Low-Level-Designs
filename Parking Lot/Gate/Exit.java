package Gate;

import PaymentInfo.ParkingTicket;
import PaymentInfo.PaymentType;

public class Exit extends Gate {
    
    public ParkingTicket payForParking(ParkingTicket parkingTicket, PaymentType paymentType) {
        return parkingTicket;
    }

}
