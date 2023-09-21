class CricketPlatform
{
    String playerNames[]= new String[10]; 
    int index; 

    // Method to add a cricket player name
    public boolean addPlayerNames(String playerName) 
	{
        boolean isAdded = false; // Local variable
        if( index <playerNames.length)
		{
          if (playerName != null ) 
		  {
			boolean exists=checkIfExists(playerName);
			if(exists==false)
			{
            
            playerNames[index] = playerName;
            index++;
            isAdded = true;
			}
			else
			{
				System.out.println("Player if full cannot add more names ");
			}
          }
		}
		else
		{
			System.out.println("playerName size is full..cannot procees to add the data");
		}

        return isAdded;
    }
	public boolean checkIfExists(String playerName)
	{
		boolean exists=false;
		for(int index=0;index<playerNames.length;index++)
		{
			if(playerNames[index]==playerName)
			{
			exists=true;
			}
		}
		return exists;
	}
	
	

    // Method to retrieve and print cricket player names
    public void getPlayerNames() 
	{
        System.out.println("Cricket Player Names:");
        for (int index=0; index < playerNames.length; index++) {
            System.out.println(playerNames[index]);
        }
    }
	
	// Search for a playerName
		public String searchByPlayerName(String playerName)
		{      
			for(int i=0;i<playerNames.length;i++)
			{
				if(playerNames[i]==playerName)
					  return playerName;
			}
			 return null;
		}
		
		
		
        public boolean deletedByPlayer(String playerName)
	{
		boolean isDeleted=false;
		String playerNameAfterDelete[]=new String [playerNames.length-1];
		int ind=0;
		for(int index=0;index<playerNames.length;index++)
        {
			if(playerNames[index]!=playerName)
			{
				playerNames[ind++]=playerNames[index];
			    isDeleted=true;
			}
		}
		
	
	return isDeleted;
    }
}