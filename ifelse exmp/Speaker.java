class Speaker{

    static boolean isConnected;
	
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

}