class OttPlatform{

      String movieNames[] = new String[7];
	  int index;
	      
	  //create/add/save
	  public boolean addMovieName(String movieName)
	  {
	       boolean isAdded = false;
	    if(index<movieNames.length)
		{
	        if(movieName != null)
			{
		      boolean exists = checkIfMovieNameExists(movieName);
		      if(exists == false)
			  {
	 
	           movieNames[index] = movieName;
                index++;
	         isAdded = true;
			  }
	  
	          else
			  {
		       System.out.println(movieName + " is already exists");
			  }
            }
	    }
	   else
	   {
		  System.out.println("movie names are filled.. you cannot proceed to add");
	   }
          return isAdded;
	  }
	public void getMovieNames(){
	System.out.println("the list of movie names are:");
	for(int index=0; index<movieNames.length; index++){
	System.out.println(movieNames[index]);
	  }
	}
	
	  public boolean checkIfMovieNameExists(String movieName)
	    {
		  boolean exists = false;
		  for(int index=0; index<movieNames.length; index++)
		  {
	      if(movieNames[index] ==  movieName)
		     {
	          exists = true;
	         }
		  }
	 
	      return exists;
		}
	  
	
    }