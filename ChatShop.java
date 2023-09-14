class ChatShop {

    String chatNames[] = new String[12];
    int index;

    //method to create/add/save
    public boolean addChatName(String chatName) {
        boolean isAdded = false;
		if(index<chatNames.length){
        if (chatName != null) {
			boolean exists = checkIfChatNameExists(chatName);
		      if(exists == false)
			  {
	           chatNames[index] = chatName;
                index++;
	           isAdded = true;
			  }
			  else{
				  System.out.println(chatName + " is already exist");
			  }
            }
		}
		else
		{
		
			System.out.println("chat names are filled you cannot proceed to add");
		}
        return isAdded;
    }

    public void getChatNames() {
        System.out.println("The list of chat names are:");
        for (int index = 0; index < chatNames.length; index++) {
            System.out.println(chatNames[index]);
        }
    }
	
	public boolean checkIfChatNameExists(String chatName)
		{
			boolean exists=false;
	      for(int index=0;index<chatNames.length;index++)
	       {
		  
			   if (chatNames[index]==chatName)
			   {
			    exists=true;
			   }
		   
	       }
		     return exists;
        }
		
		

}