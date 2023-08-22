class PostmatesExecutor
{
public static void main (String food[])
{
System.out.println("main started");
 double price = Postmates.search("Spring rolls");
 System.out.println("price of the Spring rolls is " +price);
 
 double priceWithQuantity = Postmates.search("Spring rolls",4);
 System.out.println("price of the Spring rolls is " +priceWithQuantity);
 
 System.out.println("main ended");
 }
 }