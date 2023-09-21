class Spotify
{
    String songNames[] = new String[10]; // Array to store song names 
    int index; // Instance variable 

    // Method to add a song name
    public boolean addSongName(String songName) {
    boolean isAdded = false;
    if (index < songNames.length) {
        if (songName != null) {
            boolean exists = checkIfNameExists(songName);
            if (!exists) {
                songNames[index++] = songName;
                isAdded = true;
            } else {
                System.out.println(songName + " is already added");
            }
        } else {
            System.out.println("Invalid song name. Cannot proceed to add the data.");
        }
    } else {
        System.out.println("Size is full. Cannot proceed to add more songs.");
    }
    return isAdded;
}

	public boolean checkIfNameExists(String songName)
		{
			boolean exists=false;
	      for(int index=0;index<songNames.length;index++)
	       {
		  
			   if (songNames[index]==songName)
			   {
			    exists=true;
			   }
		   
	       }  
		  return exists;
		}
		

    // Method to retrieve and print song names
    public void getSongNames() 
	{
		System.out.println("The list of Songs are:");
        
        for (int index= 0; index < songNames.length; index++)
			{
            System.out.println(songNames[index] );
        }
    }
	
	//search
    public String searchSongName( String songName)
		{      
			for(int i=0;i<songNames.length;i++)
			{
				if(songNames[i]==songName)
					  return songName;
			}
			return null;
		}
		
	// deleted;
   public boolean deletedBySong(String song)
  {
	  boolean isDeleted=false;
	  int ind=0;
	  for(int i=0;i<songNames.length;i++)
	  {
		  if(songNames[i]!=song)
		  {
			  songNames[ind++]=songNames[i];
		      isDeleted=true;  
		  }		   
	  }
  return isDeleted;
}
}
