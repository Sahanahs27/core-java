class State{
	
	private int stateId;
	private String stateName;
	private int noOfDistricts;
	private String capital;
	
	public State(){
		
	}
	public void setStateId(int stateId){
		this.stateId=stateId;
	}
	public int getStateId(){
		return stateId;
	}
	
	public void setStateName(String stateName){
		this.stateName=stateName;
	}
	public String getStateName(){
		return stateName;
	}
	
	public void setNoOfDistricts(int noOfDistricts){
		this.noOfDistricts=noOfDistricts;
	}
	
	public int getNoOfDistricts(){
		return noOfDistricts;
	}
	
	public void setCapital(String capital){
		this.capital=capital;
	}
	public String getCapital(){
		return capital;
	}
	
}
