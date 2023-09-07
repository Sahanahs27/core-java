public class Patient{


    private int patientId;
    private String patientName;
    private String address;
    private String gender;
	private int age;
    private String diseaseName;
	private String hospitalName;
	private String admittedDate;
	private int wardNo;
    private long contactNo;
 
  public void setPatientId(int patientId){
  this.patientId = patientId;
  }

  public int getPatientId(){
  return patientId;
  }
  
  public void setPatientName(String patientName){
  this.patientName = patientName;
  }

  public String getPatientName(){
  return patientName;
  }
  
  public void setAddress(String address){
  this.address = address;
  }

  public String getAddress(){
  return address;
  }
  
   public void setGender(String gender){
  this.gender = gender;
  }

  public String getGender(){
  return gender;
  }
  
  
   public void setAge(int age){
  this.age = age;
  }

  public int getAge(){
  return age;
  }
  
  
   public void setDiseaseName(String diseaseName){
  this.diseaseName = diseaseName;
  }

  public String getDiseaseName(){
  return diseaseName;
  }
  
  
   public void setHospitalName(String hospitalName){
  this.hospitalName = hospitalName;
  }

  public String getHospitalName(){
  return hospitalName;
  }
  
  public void setAdmittedDate(String admittedDate){
  this.admittedDate = admittedDate;
  }

  public String getAdmittedDate(){
  return admittedDate;
  }
  
  public void setWardNo(int wardNo){
  this.wardNo = wardNo;
  }

  public int getWardNo(){
  return wardNo;
  }
  
  public void setContactNo(long contactNo){
  this.contactNo = contactNo;
  }

  public long getContactNo(){
  return contactNo;
  }




}