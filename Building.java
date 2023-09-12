class Building{
   
   static int apartmentId = 1;   
   static String name = "Prestige";
   static String loc = "jp nagar";
   static int floors = 55;
   
     public static void provideAccomadation(){
	   
	 System.out.println("providing large space for accomadation");  
	   
	   
   }
   
   public void displayInfo(){
	   System.out.println("apartment id is: " + apartmentId);
        System.out.println("apartment Name: " + name);
		System.out.println("apartment loc is: " +loc);
        System.out.println("Number of Floors: " + floors);
    }

}

