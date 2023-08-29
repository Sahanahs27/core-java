class SpeakerVolume{

    static boolean isConnected;
	static int minVolume;
	static int maxVolume=5;
	static int currentVolume;
	
	public static boolean onoroff(){
	System.out.println("inside onoroff");
	if(isConnected == false){
	isConnected = true;
	System.out.println("the speker is turned on");
	}
	else if(isConnected == true){
		isConnected = false;
	System.out.println("the speker is turned off");
	}
	System.out.println("end of onoroff");
	return isConnected;
	}

    public static void increaseVolume(){
	
	 System.out.println("start of increase volume");
	  if(isConnected == true){
	  if(currentVolume < maxVolume){
	  currentVolume= currentVolume+1; 
	  System.out.println("the current volume is "+currentVolume);
	  }
	  else{
	  System.out.println("the maximum volume is reached");
	  }
	  }
	  else{
	  System.out.println("first speaker on madu");
	  }
      System.out.println("end of increase volume");
	}

   
   
    public static void decreaseVolume(){
	
	 System.out.println("start of decrease volume");
	  if(isConnected == true)
	  {
	  if(currentVolume > minVolume)
	  {
	  currentVolume= currentVolume-1; 
	  System.out.println("the current volume is "+currentVolume);
	  }
	  else
	  {
	  System.out.println("the minimum volume is reached");
	  }
	  }
	  else
	  {
	  System.out.println("first speaker on madu");
	  }
      System.out.println("end of decrease volume");
	}
}