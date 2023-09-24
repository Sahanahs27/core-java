class ClientsExecutor{
	public static void main(String[] soft){
		
	
	Clients clients=new Clients();
	clients.setClientName("Sinchana");
	clients.setWorthInCr(150);
	clients.setProduct("Banking application");
	clients.setIndustry(" Technology");
		
	Companies	companies=new Companies();
	companies.clients=clients;
	companies.companieName="TCS";
	
		System.out.println("Company Name : "+companies.companieName);
		System.out.println("Client Name : "+companies.clients.getClientName());
		System.out.println("Contarct worth in Cr : "+companies.clients.getWorthInCr());
		System.out.println("Industry : "+companies.clients.getIndustry());
		System.out.println("Product : "+companies.clients.getProduct());
		
		
		
	}
}
