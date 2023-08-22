class UberExecutor
{
public static void main (String foodDelivery[])
{
System.out.println("main started");
 double price1 = UberEats.search("vada pav");
 System.out.println("price of the vada pav is " +price1);
 
 double priceWithQuantity  = UberEats.search("vada pav");
 System.out.println("price of the vada pav with quantity is " +priceWithQuantity);
}
}