package PaymentInfo;

import java.util.Date;

import ParkingStructure.ParkingSpaceType;

public class ParkingTicket {

	int ticketId;
	int levelId;
	int spaceId;
	Date vehicleEntryDateTime;
	Date vehicleExitDateTime;
	ParkingSpaceType parkingSpaceType;
	double totalCost;
	ParkingTicketStatus parkingTicketStatus;

    public void updateTotalCost() {}
    
	public void updateVehicleExitTime(Date vehicleExitDateTime) {}

}
