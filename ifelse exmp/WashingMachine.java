class WashingMachine{

    static boolean isConnected;
	static int minSpeed;
	static int maxSpeed=8;
	static int currentSpeed;
	
	public static boolean onoroff(){
	System.out.println("inside onoroff");
	if(isConnected == false){  // false==false
	isConnected = true;
	System.out.println("the washing machine is turned on");
	}
	else if(isConnected == true){     //true=true
		isConnected = false;
	System.out.println("the washing machine is turned off");
	}
	System.out.println("end of onoroff");
	return isConnected;
	}

    public static void increaseSpeed(){
	 System.out.println("start of increase speed");
	  if(isConnected == true){
	  if(currentSpeed < maxSpeed){
	  currentSpeed= currentSpeed+1; 
	  System.out.println("the current speed is "+currentSpeed);
	  }
	  else{
	  System.out.println("the maximum volume is reached");
	  }
	  }
	  else{
	  System.out.println("first switch on madu");
	  }
      System.out.println("end of increase speed");
	}

   
    public static void decreaseSpeed(){
	
	 System.out.println("start of decrease speed");
	  if(isConnected == true)
	  {
	  if(currentSpeed > minSpeed)
	  {
	  currentSpeed= currentSpeed-1; 
	  System.out.println("the current volume is "+currentSpeed);
	  }
	  else
	  {
	  System.out.println("the minimum speed is reached");
	  }
	  }
	  else
	  {
	  System.out.println("first switch on madu");
	  }
      System.out.println("end of decrease speed");
	}
}