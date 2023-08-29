class IronBox{

    static boolean isPowerOn;
	static int minTemp;
	static int maxTemp=6;
	static int currentTemp;
	
	public static boolean onoroff(){
	System.out.println("inside onoroff");
	if(isPowerOn == false){   
	isPowerOn = true;
	System.out.println("the airconditioner is turned on");
	}
	else if(isPowerOn == true){     
		isPowerOn = false;
	System.out.println("the air conditioner is turned off");
	}
	System.out.println("end of onoroff");
	return isPowerOn;
	}

    public static void increaseTemp(){
	 System.out.println("start of increase temp");
	  if(isPowerOn == true){
	  if(currentTemp < maxTemp){
	  currentTemp= currentTemp+1; 
	  System.out.println("the current temp is "+currentTemp);
	  }
	  else{
	  System.out.println("the maximum temp is reached");
	  }
	  }
	  else{
	  System.out.println("first power on madu");
	  }
      System.out.println("end of increase temp");
	}

   
    public static void decreaseTemp(){
	
	 System.out.println("start of decrease temp");
	  if(isPowerOn == true)
	  {
	  if(currentTemp > minTemp)
	  {
	  currentTemp= currentTemp-1; 
	  System.out.println("the current temp is "+currentTemp);
	  }
	  else
	  {
	  System.out.println("the minimum temp is reached");
	  }
	  }
	  else
	  {
	  System.out.println("first power on madu");
	  }
      System.out.println("end of decrease temp");
	}
}