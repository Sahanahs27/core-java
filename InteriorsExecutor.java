class InteriorsExecutor{

public static void main(String interiors[]){

Interiors materialName = new Interiors();
materialName.addMaterialName("Wood");
materialName.addMaterialName("Glass");
materialName.addMaterialName("Marble");
materialName.addMaterialName("Tile");
materialName.addMaterialName("Textile");
materialName.addMaterialName("kallu");
materialName.addMaterialName("Metal");
materialName.addMaterialName("Ceramic");
materialName.addMaterialName("Metal");
materialName.addMaterialName("Plastic");

materialName.getMaterialNames();

      String materialsName = "Glass";
      System.out.println("Searching for the materialName " +materialsName);
      String mName=materialName.searchMaterialName(materialsName);
	  System.out.println(mName +" is found! thank you searching. " );
	  
	  
	  
	  String iName="Metal";
	boolean  deletedMaterial=materialName.deletedByMaterial(iName);
	System.out.println("is " + iName +" material deleted ? : " +deletedMaterial);
        
}
}
