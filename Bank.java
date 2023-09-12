class Bank{

     int bankId = 1;
     String bankName = "SBI";
     String address = "T narasipura";
     String ifscCode = "SBI1234";
     String branchName = "main branch";
	 int noOfWorkers = 50;
     String branchEmail = "sbi123@gmail.com";
   	 String manager = "manjunath";
	 
	 public void getTransaction(){
	 
	 System.out.println("transaction is a record of money that has moved in and out of your bank account");
	 }
    
	    public void displayBankInfo() {
        System.out.println("Bank ID: " + bankId);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Address: " + address);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Branch Name: " + branchName);
        System.out.println("Number of Workers: " + noOfWorkers);
        System.out.println("Branch Email: " + branchEmail);
        System.out.println("Manager: " + manager);
    }
 }