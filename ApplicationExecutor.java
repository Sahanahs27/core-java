class ApplicationExecutor{

     public static void main(String application[]){
	 
	 Application app = new Application();
	 app.setName("phonepe");
	 app.setSizeInMb(800);
	 app.setVersion("5.1.1 apk");
	 app.setRatings("4.1");
	 app.setNoOfDownloads("1,000");
	 app.setCompanyName("private limited");
	 
	 PlayStore store = new PlayStore();
	 // has-A relationship// setApplication=app; is another way
	 store.application = app;
	 store.managedBy = "google";
	 
	 System.out.println(store.application.getName());
	 System.out.println(store.application.getSizeInMb());
	 System.out.println(store.application.getVersion());
	 System.out.println(store.application.getRatings());
	 System.out.println(store.application.getNoOfDownloads());
	 System.out.println(store.application.getCompanyName());
	 System.out.println(store.managedBy);
	 
     
   
	 }


}