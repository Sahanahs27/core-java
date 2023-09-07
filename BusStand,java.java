public class BusStand {

    private String standName;
    private int numberOfPlatforms;
    private int ticketCounter;
    private int waitingRoomCapacity;
    private int busCount;

    public void setStandName(String standName) {
        this.standName = standName;
    }
	
    public String getStandName() {
        return standName;
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
	
	public void setBusCount(int busCount) {
        this.busCount = busCount;
    }

    public int getBusCount() {
        return busCount;
    }

   
}
