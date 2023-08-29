class ApartmentExecutor{

   public static void main(String apart[]){
    
	Apartment apartment = new Apartment();
	apartment.apartmentId = 1;
	apartment.apartmentName = "prestige";
	apartment.location = "whitefield";
	apartment.noOfFloors = 45;
	apartment.noOfTwoBhkFlats = 180;
	apartment.noOfThreeBhkFlats = 90;
	
	System.out.println("apartmentId is " +apartment.apartmentId);
	System.out.println("apartmentName is " +apartment.apartmentName);
	System.out.println("apartment location is " +apartment.location);
	System.out.println("apartment NoOfFloors is " +apartment.noOfFloors);
	System.out.println("apartment NoOfTwoBhkFlats is " +apartment.noOfTwoBhkFlats);
	System.out.println("apartment NoOfThreeBhkFlats " +apartment.noOfThreeBhkFlats);
	apartment.provideAccomadation();
	System.out.println("-------------------------------------------------\n");
	
	Apartment apartment1 = new Apartment();
	apartment1.apartmentId = 2;
	apartment1.apartmentName = "prestige";
	apartment1.location = "rajajinagar";
	apartment1.noOfFloors = 50;
	apartment1.noOfTwoBhkFlats = 250;
	apartment1.noOfThreeBhkFlats = 120;
	
	System.out.println("apartment Id is " +apartment1.apartmentId);
	System.out.println("apartment Name is " +apartment1.apartmentName);
	System.out.println("apartment location is " +apartment1.location);
	System.out.println("apartment NoOfFloors is " +apartment1.noOfFloors);
	System.out.println("apartment NoOfTwoBhkFlats is " +apartment1.noOfTwoBhkFlats);
	System.out.println("apartment NoOfThreeBhkFlats " +apartment1.noOfThreeBhkFlats);
	apartment1.provideAccomadation();
	System.out.println("-------------------------------------------------\n");
   
   
    Apartment apartment2 = new Apartment();
	apartment2.apartmentId = 3;
	apartment2.apartmentName = "prestige";
	apartment2.location = "jpnagar";
	apartment2.noOfFloors = 60;
	apartment2.noOfTwoBhkFlats = 250;
	apartment2.noOfThreeBhkFlats = 100;
	
	System.out.println("apartment Id is " +apartment2.apartmentId);
	System.out.println("apartment Name is " +apartment2.apartmentName);
	System.out.println("apartment location is " +apartment2.location);
	System.out.println("apartment NoOfFloors is " +apartment2.noOfFloors);
	System.out.println("apartment NoOfTwoBhkFlats is " +apartment2.noOfTwoBhkFlats);
	System.out.println("apartment NoOfThreeBhkFlats is " +apartment2.noOfThreeBhkFlats);
	apartment2.provideAccomadation();
	System.out.println("-------------------------------------------------\n");
	
	Apartment apartment3 = new Apartment();
	apartment3.apartmentId = 4;
	apartment3.apartmentName = "prestige";
	apartment3.location = "kuvempu nagar";
	apartment3.noOfFloors = 50;
	apartment3.noOfTwoBhkFlats = 180;
	apartment3.noOfThreeBhkFlats = 120;
	
	System.out.println("apartment Id is " +apartment3.apartmentId);
	System.out.println("apartment Name is " +apartment3.apartmentName);
	System.out.println("apartment location is " +apartment3.location);
	System.out.println("apartment NoOfFloors is " +apartment3.noOfFloors);
	System.out.println("apartment NoOfTwoBhkFlats is " +apartment3.noOfTwoBhkFlats);
	System.out.println("apartment NoOfThreeBhkFlats is " +apartment3.noOfThreeBhkFlats);
	apartment3.provideAccomadation();
	System.out.println("-------------------------------------------------\n");
	
	Apartment apartment4 = new Apartment();
	apartment4.apartmentId = 5;
	apartment4.apartmentName = "prestige";
	apartment4.location = "nagarvara";
	apartment4.noOfFloors = 65;
	apartment4.noOfTwoBhkFlats = 270;
	apartment4.noOfThreeBhkFlats = 190;
	
	System.out.println("apartment Id is " +apartment4.apartmentId);
	System.out.println("apartment Name is " +apartment4.apartmentName);
	System.out.println("apartment location is " +apartment4.location);
	System.out.println("apartment NoOfFloors is " +apartment4.noOfFloors);
	System.out.println("apartment NoOfTwoBhkFlats is " +apartment4.noOfTwoBhkFlats);
	System.out.println("apartment NoOfThreeBhkFlats " +apartment4.noOfThreeBhkFlats);
	apartment4.provideAccomadation();
	System.out.println("-------------------------------------------------\n");
	
   
   
   }




}