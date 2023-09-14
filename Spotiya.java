class Spotiya {

    String songNames[] = new String[11];
    int index;

    // Method to add a song name to the array
    public boolean addSongName(String songName) {
        boolean isAdded = false;
		if(index<songNames.length){
        if (songName != null) {
			boolean exists = checkIfSongNameExists(songName);
			if(exists == false)
			{
            songNames[index] = songName;
            index++;
            isAdded = true;
             }
		    else{
			System.out.println(songName + " is already exists");
		       }
		    }
	    }
		else{
			System.out.println("Song names are filled");
	    }
        return isAdded;
    }

    // Method to display the list of song names
    public void displaySongs() {
        System.out.println("Spotiya Playlist:");
        for (int index = 0; index < songNames.length; index++) {
            System.out.println(songNames[index]);
        }
    }
     public boolean checkIfSongNameExists(String songName)
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
   
}
