public class RailwayStation {

    private String stationName;
    private int numberOfPlatforms;
    private int ticketCounter;
    private int waitingRoomCapacity;
    private int trainCount;

	public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationName() {
        return stationName;
    }
    
	public void setNumberOfPlatforms(int numberOfPlatforms) {
        this.numberOfPlatforms = numberOfPlatforms;
    }
   
    public int getNumberOfPlatforms() {
        return numberOfPlatforms;
    }
	
	 public void setTicketCounter(int ticketCounter) {
        this.ticketCounter = ticketCounter;
    }

    public int getTicketCounter() {
        return ticketCounter;
    }

     public void setWaitingRoomCapacity(int waitingRoomCapacity) {
        this.waitingRoomCapacity = waitingRoomCapacity;
    }
	
    public int getWaitingRoomCapacity() {
        return waitingRoomCapacity;
    }

    public void setTrainCount(int trainCount) {
        this.trainCount = trainCount;
    }
	
    public int getTrainCount() {
        return trainCount;
    }


}

