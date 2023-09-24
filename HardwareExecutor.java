class HardwareExecutor {
    public static void main(String hardwares[]) 
	{
        // Create a hardware object
        Hardware hardware = new Hardware();

        // Set hardware properties using setter methods
        hardware.setHardwareName("Mi note 8");
        hardware.setPrice(19000);
        hardware.setCompanyName("Xiaomi");
        hardware.setWeight(5.2);
        hardware.setWarrantyPeriod(24);
        hardware.setModelNumber("12345");
       
	   Software software=new Software();
	   software.hardware=hardware;
       software.softwareName="Android 11";
       software.work();
	    System.out.println("The software name is "+software.softwareName);
        System.out.println("Hardware Name: " + hardware.getHardwareName());
        System.out.println("Price: $" + hardware.getPrice());
        System.out.println("Company Name: " + hardware.getCompanyName());
        System.out.println("Weight: " + hardware.getWeight() + " kg");
        System.out.println("Warranty Period: " + hardware.getWarrantyPeriod() + " months");
        System.out.println("Model Number: " + hardware.getModelNumber());
       
    }
}
