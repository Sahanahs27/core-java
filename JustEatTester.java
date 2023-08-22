class JustEatTester{
    public static void main(String foodDelivery[]){
	
	System.out.println("Main started");
	double price1 = JustEat.search("paneer 65");
	System.out.println("the price for paneer 65 is" +price1);
	
	double priceWithQuantity = JustEat.search("paneer 65",3);
	System.out.println("the price for paneer 65 is" +priceWithQuantity);
	
	System.out.println("Main ended");
	}
	}