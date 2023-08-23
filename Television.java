class Television{

    static boolean isConnected;
	static int minVolume;
	static int maxVolume=10;
	static int currentVolume;
	
   public static void onoroff(){
   System.out.println("inside onoroff");
   if(isConnected == false){
   isConnected = true;
   System.out.println("the Speaker is turned on");
   }
   else if(isConnected == true){
    isConnected = false;
    System.out.println("the speaker is turned off");
    }
    System.out.println("end of onoroff");
   }
   
    public static void increaseVolume(){
    System.out.println("start increase volume");
    if(isConnected == true){
    if(currentVolume<maxVolume){
    currentVolume = currentVolume+1;
    System.out.println("the current volume is "+currentVolume);
    }
    else{
    System.out.println("the maximum volume is reached");
    }
	}
    else{
    System.out.println("turned on speaker");
    }
	}	
	
	public static void decreaseVolume(){
    System.out.println("start decrease volume");
	if(isConnected == true){
    if(currentVolume > minVolume){
	currentVolume= currentVolume-1;
    System.out.println("the current volume is " +currentVolume);
    }
    else{
    System.out.println("the minimum volume is reached");
    }
	}
    else{
     System.out.println("first turned on televison");
	}
	}	
}