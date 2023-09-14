class Interiors{

     String interiors [] = new String [10];
	 int index;
	 
	 public boolean addInteriors(String interior){
	       boolean isAdded = false;
		   if(interior != null){
		      interiors[index]=interior;
			  index++;
			  isAdded = true;
		   }return isAdded;
	 
	 }
	 
	 public void getDetails(){
	       System.out.println("The Designs contains the items : ");
	     for(int index = 0; index < interiors.length ; index++){
		 System.out.println(interiors[index]+ " is added to the desigining");
	 
	 }


}
}