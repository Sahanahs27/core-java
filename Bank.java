public class Bank{


    private int bankId;
    private String bankName;
    private String address;
    private String ifscCode;
    private String branchName;
	private int noOfWorkers;
    private String branchEmail;
    private String manager;
 
  public void setBankId(int bankId){
  this.bankId = bankId;
  }

  public int getBankId(){
  return bankId;
  }
  
  public void setBankName(String bankName){
  this.bankName = bankName;
  }

  public String getBankName(){
  return bankName;
  }
  
  public void setAddress(String address){
  this.address = address;
  }

  public String getAddress(){
  return address;
  }
  
   public void setIfscCode(String ifscCode){
  this.ifscCode = ifscCode;
  }

  public String getIfscCode()
  {
  return ifscCode;
  }
  
  
   public void setBranchName(String branchName){
  this.branchName = branchName;
  }

  public String getBranchName(){
  return branchName;
  }
  
  public void setNoOfWorkers(int noOfWorkers){
  this.noOfWorkers = noOfWorkers;
  }

  public int getNoOfWorkers(){
  return noOfWorkers;
  }
  
   public void setBranchEmail(String branchEmail){
  this.branchEmail = branchEmail;
  }

  public String getBranchEmail(){
  return branchEmail;
  }
  
  
   public void setManager(String manager){
  this.manager = manager;
  }

  public String getManager(){
  return manager;
  }

}