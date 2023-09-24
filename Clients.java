class Clients{
	private String clientName;
	private int worthInCr;
	private String product;
	private String industry;
	
	
	public Clients(){
		
	}
	public void setClientName(String clientName){
		this.clientName=clientName;
	}
	public String getClientName(){
		return clientName;
	}
	public void setWorthInCr(int worthInCr){
		this.worthInCr=worthInCr;
	}
	public int getWorthInCr(){
		return worthInCr;
	}
	public void setProduct(String product){
		this.product=product;
	}
	public String getProduct(){
		return product;
	}
	 public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getIndustry() {
        return industry;
    }
	
}
