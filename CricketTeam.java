class CricketTeam {

    String playerNames[] = new String[11];
    int index;

    public boolean addPlayerName(String playerName) {
        
        boolean isAdded = false;
		if(index<playerNames.length){
        if (playerName != null) {
			boolean exists = checkIfPlayerNameExists(playerName);
			if(exists == false){
               playerNames[index] = playerName;
               index++;
               isAdded = true;
             } 
		     else{
			System.out.println(playerName + " is already exists");
		       }
		   }
		}
        else{
			System.out.println("player names are filled.. you cannot proceed to add");;
		}		
		 return isAdded;
    }

    // Method to display the list of player names
    public void displayPlayers() {
        System.out.println("Cricket Team Players:");
        for (int index = 0; index < playerNames.length; index++) {
            System.out.println(playerNames[index]);
        }
    }
	
	public boolean checkIfPlayerNameExists(String playerName)
		{
			boolean exists=false;
	      for(int index=0;index<playerNames.length;index++)
	       {
		  
			   if (playerNames[index]==playerName)
			   {
			    exists=true;
			   }
		   
	       }
		     return exists;
        }

  
}

