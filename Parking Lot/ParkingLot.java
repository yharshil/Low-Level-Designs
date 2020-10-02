import java.util.List;

import Account.Address;
import Account.ParkingAttendant;
import Gate.Entrance;
import Gate.Exit;
import ParkingStructure.ParkingFloor;
import Vehicle.Vehicle;

public class ParkingLot {

    String parkingLotName;
    Address address;
    List<ParkingFloor> parkingFloors;
    List<Entrance> entryGates;
    List<Exit> exitGates;
    
    public boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle) {
        return false;
    }

    public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, int gateID) {
        return false;
    }

}