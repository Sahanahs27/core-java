class JvmExecutor{
	public static void main(String exe[]){
		
	
	Jvm jvm=new Jvm();
	 jvm.setPurpose("Java application execution");
        jvm.setVersion("Java SE 11");
        jvm.setPlatform("Windows");
        jvm.setVendor("Oracle");
        jvm.setHeapSize("512MB");
       
		
	Java java=new Java();
	java.jvm=jvm;
	java.hostCompanyName="Sun Microsystems";
		
		System.out.println("Hosting Company Name : "+java.hostCompanyName);
		System.out.println("Purpose : "+java.jvm.getPurpose());
		System.out.println("Version : "+java.jvm.getVersion());
		System.out.println("Platfrom : "+java.jvm.getPlatform());
		 System.out.println("Vendor: " + java.jvm.getVendor());
        System.out.println("Heap Size: " + java.jvm.getHeapSize());
		
	}
}
