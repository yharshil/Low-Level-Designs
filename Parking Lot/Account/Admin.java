package Account;

import ParkingStructure.ParkingDisplayBoard;
import ParkingStructure.ParkingFloor;
import ParkingStructure.ParkingSpace;

public class Admin extends Account {

    public <ParkingLot> boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor parkingFloor) {
        return false;
    }

    public boolean addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace) {
        return false;
    }

    public boolean addParkingDisplayBoard(ParkingFloor parkingFloor, ParkingDisplayBoard parkingDisplayBoard) {
        return false;
    }
    
}
