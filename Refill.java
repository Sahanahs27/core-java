class Refill{
	private String refillName;
	private String  color;
	private String  type;
	private int  price;
	
	public Refill(){
		
	}
	public void setRefillName(String refillName){
		this.refillName=refillName;
	}
	public String getRefillName(){
		return refillName;
	}
	
	 public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
	public void setColor(String  color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setType(String  type){
		this.type=type;
	}
	public String getType(){
		return type;
	}
	
}
