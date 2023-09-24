class Sim{

    private String simName;
	private int countryCode;
    private long phoneNumber;
	private String dataPack;
    private int balance;

    public Sim(){
    }
	
	public void setSimName(String simName){
	 this.simName = simName;
	 }
	 
    public String getSimName() {
        return simName;
    }
	
	public void setCountryCode(int countryCode){
	 this.countryCode = countryCode;
	 }

    public int getCountryCode() {
        return countryCode;
    }
	
	public void setPhoneNumber(long phoneNumber){
	 this.phoneNumber = phoneNumber;
	 }

    public long getPhoneNumber() {
        return phoneNumber;
    }
     
	public void setDataPack(String dataPack){
	 this.dataPack = dataPack;
	 }
	 
    public String getDataPack() {
        return dataPack;
    }
     
	public void setBalance(int balance){
	 this.balance = balance;
	 }
	 
    public int getBalance() {
        return balance;
    }


}


