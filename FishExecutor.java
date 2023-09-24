class FishExecutor{
	
	public static void main(String[] machele){
		Fish fish=new Fish();
		fish.setFishId(2);
		fish.setFishName("Oscar");
		fish.setPrice(150);
		fish.setWeight(1.6);
		
		Water water=new Water();
		water.fish=fish;
		water.waterType="brackish water";
		System.out.println("Water Type : "+water.waterType);
		System.out.println("Fish Id : "+water.fish.getFishId());
		System.out.println("Fish Name : "+water.fish.getFishName());
		System.out.println("Fish Price : "+water.fish.getPrice());
		System.out.println("Fish Weigth : "+water.fish.getWeight());
		
	}
	
}
