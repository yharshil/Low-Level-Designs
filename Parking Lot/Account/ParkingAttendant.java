package Account;

import PaymentInfo.Payment;
import Vehicle.Vehicle;

public class ParkingAttendant extends Account {
    
    Payment processPayment;

    public boolean processVehicleEntry(Vehicle vehicle) {
        return false;
    }

}
