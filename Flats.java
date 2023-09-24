class Flats{
	private String flatId;
	private int noOfDoor;
	private int noOfWindoors;
	 private int floorNumber;
	
	
	public Flats(){
		
	}
	public void setFlatId(String flatId){
		this.flatId=flatId;
	}
	public void setNoOfDoors(int noOfDoor){
		this.noOfDoor=noOfDoor;
	}
	public void setNoOfWindoors(int noOfWindoors){
		this.noOfWindoors=noOfWindoors;
	}
	public String getFlatId(){
		return flatId;
	}
	public int getNoOfDoors(){
		return noOfDoor;
	}
	public int getNoOfWindoors(){
		return noOfWindoors;
	}
	
	public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
	
}
