class RefillExecutor{
	public static void main(String refills[]){
		
	Refill refill=new Refill();
	
	refill.setRefillName("Nataraja");
	refill.setColor("Black");
	refill.setType("Use and tough");
	refill.setPrice(10);
		
	Pen pen=new Pen();
	
	pen.refill=refill;
	
	pen.penName="Nataraja Pen";
		
	System.out.println("The name of the Pen is "+pen.penName);
	System.out.println("Refill Name : "+pen.refill.getRefillName());
	System.out.println("Refill colour : "+pen.refill.getColor());
	System.out.println("Refill type : "+pen.refill.getType());
	System.out.println("Refill price: "+pen.refill.getPrice());
	
		
	}
}
