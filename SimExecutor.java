class SimExecutor{
     
	 public static void main(String simexe[]) {
  
       Sim sim = new Sim();
	   sim.setSimName("jio");
	   sim.setCountryCode(91);
       sim.setPhoneNumber(7090538552L);
       sim.setDataPack("4GB 239 rs");
       sim.setBalance(300);
	   
	   CellPhone cellPhone = new CellPhone();
       cellPhone.sim = sim;
	   cellPhone.cellPhoneName = "OPPO A3s";
   
       System.out.println(cellPhone.sim.getSimName());
       System.out.println(cellPhone.sim.getCountryCode());
       System.out.println(cellPhone.sim.getPhoneNumber());
       System.out.println(cellPhone.sim.getDataPack());
       System.out.println(cellPhone.sim.getBalance());
       System.out.println(cellPhone.cellPhoneName);
      }
  }
