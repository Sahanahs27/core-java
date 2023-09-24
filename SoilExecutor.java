class SoilExecutor{
    public static void main(String plants[]) 
	{
        Soil soil = new Soil();
        soil.setSoilName("Loam");
        soil.setMoistur("Moderate");
        soil.setMinerals("Rich in nutrients");
        soil.setPhLevel(6.5);
        soil.setTexture("Silt loam");

        Plant plant = new Plant();
        plant.soil = soil;
        plant.plantName = "tomato";

        System.out.println("Plant Name: " + plant.plantName);
        System.out.println("Soil Name: " + plant.soil.getSoilName());
        System.out.println("Moisture: " + plant.soil.getMoistur());
        System.out.println("Minerals: " + plant.soil.getMinerals());
		System.out.println("Minerals: " + plant.soil.getPhLevel());
		System.out.println("Minerals: " + plant.soil.getTexture());
    }
}
