class Interiors{

     String interiors [] = new String [10];
	 int index;
	 
	 public boolean addInteriors(String interior){
	       boolean isAdded = false;
		   if(index<interiors.length){
		   if(interior != null){
			   boolean exists = checkIfInteriorExists(interior);
			if(exists == false)
			  {
		        interiors[index]=interior;
			    index++;
			    isAdded = true;
		      }
			  else{
			   System.out.println(interior + " is already exists");
		       }
		    }
		   }
		   else{
			   System.out.println("design materials are filled");
		   }
		   return isAdded;
	 
	    }
	 
	 public void getDetails(){
	       System.out.println("The Designs contains the items : ");
	     for(int index = 0; index < interiors.length ; index++){
		 System.out.println(interiors[index]);
	 
	     }
		}
		
		public void displaySongs() {
        System.out.println("Spotiya Playlist:");
        for (int index = 0; index < interiors.length; index++) {
            System.out.println(interiors[index]);
        }
     }
     public boolean checkIfInteriorExists(String interior)
		{
			boolean exists=false;
	      for(int index=0;index<interiors.length;index++)
	       {
		  
			   if (interiors[index]==interior)
			   {
			    exists=true;
			   }
		   
	       }
		     return exists;
        }
    }