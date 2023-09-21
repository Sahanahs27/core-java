class ChatShop{
	String chatName[]=new String[10];
	int index;
	
	public boolean addChatName(String name){
		boolean isAdded =false;
		if(chatName.length>index  ){
		if( chatName != null){
		boolean exists=checkChatName(name);
		if(exists==false){
			
		chatName[index]=name;
		index ++;
		isAdded=true;
		}else{
			System.out.println(name+"Already exested");
		}
		}
		}else{System.out.println("Array Index Out Of BoundsException:"+chatName.length);}
					
		return isAdded;
	}
	
	public boolean checkChatName(String name){
		boolean exists=false;
		for(int index=0;index<chatName.length;index++){
			if(chatName[index]==name){
				exists=true;
				
			}
		}
		return exists;
	}
	public boolean deleteNames(String name){
		boolean isDeleted =false;
		String newChatName[]=new String[chatName.length-1];
		int ind=0;
		for(int index=0;index<chatName.length;index++){
			if(chatName[index]!=name){
				newChatName[ind++]=chatName[index];
				isDeleted=true;
			}
		}
		System.out.println("the deleted Chat name:"+name);
		System.out.println("Updated  of Chat list:");
		for(int index=0;index<newChatName.length;index++){
			System.out.println(newChatName[index]);

		}
		return isDeleted;
	}

	public String search(String name){
		String exists=null;

		for(int index=0;index<chatName.length;index++){
			if(chatName[index]==name){
				exists=chatName[index];
			}

		}
		System.out.println("Chat name is in chat Shop "+exists);

		return exists;
	}

	public void getDisplay(){
		System.out.println("list of Chat Menu:");
		for(int index=0;index< chatName.length;index++){
			System.out.println(chatName[index]);
			
		}
	}
	
	
}