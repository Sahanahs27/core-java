public class RailwayStationExecutor {

    public static void main(String[] args) {
       
        RailwayStation station = new RailwayStation();

         station.setStationName("New Central Station");
        System.out.println("Station Name: " + station.getStationName());
		
		station.setNumberOfPlatforms(12);
        System.out.println("Number of Platforms: " + station.getNumberOfPlatforms());
		
		station.setTicketCounter(4);
        System.out.println("Ticket Counter Count: " + station.getTicketCounter());
		
		 station.setWaitingRoomCapacity(120);
        System.out.println("Waiting Room Capacity: " + station.getWaitingRoomCapacity());
		
		station.setTrainCount(25);
        System.out.println("Train Count: " + station.getTrainCount());

        
      

    }
}