class OttPlatform{

      String movieNames[] = new String[4];
	  int index;
	      
	  //create/add/save
	  public boolean addMovieName(String movieName){
	  System.out.println("inside addMovieNames()");
	  boolean isAdded = false;
	  if(movieName != null){
	  System.out.println("validation is proper.. proceed to add movie name");
	  movieNames[index] = movieName;
      index++;
	  isAdded = true;
      }
      return isAdded;
	  }
	public void getMovieNames(){
	System.out.println("the list of movie names are:");
	for(int index=0; index<movieNames.length; index++){
	System.out.println(movieNames[index] + " is added Successfully");
	  }
	  
	}
	
	
}