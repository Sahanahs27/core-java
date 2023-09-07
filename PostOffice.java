public class PostOffice {

    private String officeName;
    private int postalEmployees;
    private int parcelCounter;
    private int customerWaitingAreaCapacity;
    private int mailBoxes;

   public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }
	
    public String getOfficeName() {
        return officeName;
    }
    
    
    public void setPostalEmployees(int postalEmployees) {
        this.postalEmployees = postalEmployees;
    }
    
    public int getPostalEmployees() {
        return postalEmployees;
    }

    public void setParcelCounter(int parcelCounter) {
        this.parcelCounter = parcelCounter;
    }
	
    public int getParcelCounter() {
        return parcelCounter;
    }
	
	public void setCustomerWaitingAreaCapacity(int customerWaitingAreaCapacity) {
        this.customerWaitingAreaCapacity = customerWaitingAreaCapacity;
    }
 
    public int getCustomerWaitingAreaCapacity() {
        return customerWaitingAreaCapacity;
    }

   public void setMailBoxes(int mailBoxes) {
        this.mailBoxes = mailBoxes;
    }

    public int getMailBoxes() {
        return mailBoxes;
    }

  }
    