class PatientExecutor{


   public static void main(String pat[]){
   
   Patient patient = new Patient();
   patient.setPatientId(1);
   patient.getPatientId();
   System.out.println("the patient id is:" +patient.getPatientId());
   patient.setPatientName("Divya");
   patient.getPatientName();
   System.out.println("the patient name is:" +patient.getPatientName());
   patient.setAddress("mysore");
   patient.getAddress();
   System.out.println("the patient address is:" +patient.getAddress());
   patient.setGender("Female");
   patient.getGender();
   System.out.println("the patient gender is:" +patient.getGender());
   patient.setAge(25);
   patient.getAge();
   System.out.println("the patient age is:" +patient.getAge());
   patient.setDiseaseName("heart attack patient");
   patient.getDiseaseName();
   System.out.println("the patient disease Name is:" +patient.getDiseaseName());
   patient.setHospitalName("k.R hospital");
   patient.getHospitalName();
   System.out.println("the hospital Name is:" +patient.getHospitalName());
   patient.setAdmittedDate("20/9/2021");
   patient.getAdmittedDate();
   System.out.println("the patient admittedDate is:" +patient.getAdmittedDate());
   patient.setWardNo(8);
   patient.getWardNo();
   System.out.println("the patient ward no is:" +patient.getWardNo());
   patient.setContactNo(9481340593L);
   patient.getContactNo();
   System.out.println("the patient contact no  is:" +patient.getContactNo());

   }


}