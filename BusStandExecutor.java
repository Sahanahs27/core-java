public class BusStandExecutor{

      public static void main(String[] args) {
        
        BusStand stand = new BusStand();
        stand.setStandName("New Bus Stand");
        System.out.println("Stand Name: " + stand.getStandName());
		
		stand.setNumberOfPlatforms(6);
        System.out.println("Number of Platforms: " + stand.getNumberOfPlatforms());
		
		stand.setTicketCounter(4);
        System.out.println("Ticket Counter Count: " + stand.getTicketCounter());
		
		stand.setWaitingRoomCapacity(60);
        System.out.println("Waiting Room Capacity: " + stand.getWaitingRoomCapacity());
		
		stand.setBusCount(15);
        System.out.println("Bus Count: " + stand.getBusCount());

      
    }
}