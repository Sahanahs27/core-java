class Factorial{

   //5! = 1*2*3*4*5
   //0!= 1
   public static void main(String fact[]){
   
   
    int factNumber = 5;
	int dummy = 1;
   for(int factNum = 1; factNum <= factNumber; factNum++){
   
   dummy = dummy *factNum;
 }    

System.out.println("the factorail of:" +factNumber + " is " +dummy);



   }


}