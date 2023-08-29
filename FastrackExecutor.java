class FastrackExecutor
{
	public static void main (String a[]){
		//new
		//Creating ,ultiple no class
		//ClassName reference = new ClassName();
		Fastrack Fastrack = new Fastrack();
		
		Fastrack.FastrackId=12;
		Fastrack.FastrackName="Titan";
		Fastrack.FastrackLocation="Whitefield";
		Fastrack.noOfMaterial=18;
		Fastrack.noOfColour=50;
		Fastrack.noOfDesign=130;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("FastrackId is "+Fastrack.FastrackId);
		System.out.println("FastrackName is "+Fastrack.FastrackName);
		System.out.println("Appartment LOACTION"+Fastrack.FastrackLocation);
		System.out.println("Fastrackno.OfMaterial is "+Fastrack.noOfMaterial);
		System.out.println("Fastrackno.OfColour is "+Fastrack.noOfColour);
		System.out.println("Fastrackno.OfDesign is "+Fastrack.noOfDesign);
		System.out.println("-------------------------------------------------\n");
		
		Fastrack.provideYouthFashionBrand();
		
		System.out.println("");
		
		Fastrack Fastrack1 = new Fastrack();
		
		Fastrack1.FastrackId=2;
		Fastrack1.FastrackName="Titan";
		Fastrack1.FastrackLocation="JPNagar";
		Fastrack1.noOfMaterial=12;
		Fastrack1.noOfColour=35;
		Fastrack1.noOfDesign=100;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("Fastrack1Id is "+Fastrack1.FastrackId);
		System.out.println("Fastrack1Name is "+Fastrack1.FastrackName);
		System.out.println("Fastrack Location"+Fastrack1.FastrackLocation);
		System.out.println("Fastrack1no.OfMaterial is "+Fastrack1.noOfMaterial);
		System.out.println("Fastrack1no.OfColour is "+Fastrack1.noOfColour);
		System.out.println("Fastrack1no.OfDesign is "+Fastrack1.noOfDesign);
		System.out.println("-------------------------------------------------\n");
		
	Fastrack1.provideYouthFashionBrand();
	}
}