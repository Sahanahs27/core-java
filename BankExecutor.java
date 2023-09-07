public class BankExecutor {

    public static void main(String[] args) {
  
        Bank bank = new Bank();

        // Set bank information using setter methods
        bank.setBankId(1);
		bank.getBankId();
		System.out.println("Bank ID: " + bank.getBankId());
		
        bank.setBankName("SBI");
		bank.getBankName();
	    System.out.println("Bank Name: " + bank.getBankName());
		
        bank.setAddress("123 Main Street");
		bank.getAddress();
		 System.out.println("Bank Address: " + bank.getAddress());
		 
        bank.setIfscCode("SBI1234");
		bank.getIfscCode();
		System.out.println("Bank IFSC Code: " + bank.getIfscCode());
		
        bank.setBranchName("Main Branch");
		System.out.println("Branch Name: " + bank.getBranchName());
		
		
        bank.setNoOfWorkers(20);
		bank.getNoOfWorkers();
		System.out.println("Number of Workers: " + bank.getNoOfWorkers());
		
        bank.setBranchEmail("main.branch@SBI.com");
		bank.getBranchEmail();
		System.out.println("Branch Email: " + bank.getBranchEmail());
		
        bank.setManager("John Doe");
		bank.getManager();
		System.out.println("Branch Manager: " + bank.getManager());
		
	
    }
}