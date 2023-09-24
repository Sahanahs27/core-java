class FlatsExecutor{
	public static void main(String flat[]){
		
	
	Flats flats=new Flats();
	flats.setFlatId("101A");
    flats.setNoOfDoors(2);
    flats.setNoOfWindoors(4);
    flats.setFloorNumber(1);
		
	Apartments	apartments=new Apartments();
	apartments.flats=flats;
	
	apartments.apartmentName="Tata Promont Luxury Apartments";
	
		System.out.println("Apartment Name : "+apartments.apartmentName);
		System.out.println("Flat Id : "+apartments.flats.getFlatId());
		System.out.println("No of Doors : "+apartments.flats.getNoOfDoors());
		System.out.println("No of Windoors : "+apartments.flats.getNoOfWindoors());
		System.out.println("floor number : "+apartments.flats.getFloorNumber());
		
		
	}
}
