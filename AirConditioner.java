class AirConditioner{

    static boolean isConnected;
	static int minTemp;
	static int maxTemp=10;
	static int currentTemp;
	
	public static boolean onoroff(){
	System.out.println("inside onoroff");
	if(isConnected == false){  // false==false
	isConnected = true;
	System.out.println("the airconditioner is turned on");
	}
	else if(isConnected == true){     //true=true
		isConnected = false;
	System.out.println("the air conditioner is turned off");
	}
	System.out.println("end of onoroff");
	return isConnected;
	}

    public static void increaseTemp(){
	 System.out.println("start of increase temp");
	  if(isConnected == true){
	  if(currentTemp < maxTemp){
	  currentTemp= currentTemp+1; 
	  System.out.println("the current temp is "+currentTemp);
	  }
	  else{
	  System.out.println("the maximum temp is reached");
	  }
	  }
	  else{
	  System.out.println("first switch on madu");
	  }
      System.out.println("end of increase temp");
	}

   
    public static void decreaseTemp(){
	
	 System.out.println("start of decrease temp");
	  if(isConnected == true)
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
	  System.out.println("first air condtioner on madu");
	  }
      System.out.println("end of decrease temp");
	}
}