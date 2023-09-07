public class PostOfficeExecutor{

    public static void main(String[] args) {
       
        PostOffice office = new PostOffice();

        office.setOfficeName("New Central Post Office");
        System.out.println("Office Name: " + office.getOfficeName());
		
		office.setPostalEmployees(20);
        System.out.println("Postal Employees: " + office.getPostalEmployees());
		
		office.setParcelCounter(7);
        System.out.println("Parcel Counter Count: " + office.getParcelCounter());
		
		office.setCustomerWaitingAreaCapacity(70);
        System.out.println("Customer Waiting Area Capacity: " + office.getCustomerWaitingAreaCapacity());
		
		office.setMailBoxes(120);
        System.out.println("Mail Boxes Count: " + office.getMailBoxes());

 
        
    }
}

