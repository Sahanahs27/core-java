class GasExecutor {
    public static void main(String[] args) {
       Gas gas=new Gas();
	   gas.setGasName("Domestic usage");
	   gas.setVolume(15.5);
	   gas.setPrice(2000);
	   
	   Cylinder cylinder=new Cylinder();
	   cylinder.gas=gas;
	   cylinder.cylinderName="Hindustan Petroleum Corporation ";

        System.out.println("Cylinder Name: " +cylinder.cylinderName);
        System.out.println("Gas Type: " + cylinder.gas.getGasName());
        System.out.println("Gas Volume: " + cylinder.gas.getVolume()+ " liters");
		System.out.println("Gas price: " + cylinder.gas.getPrice());
    }
}
