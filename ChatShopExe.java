class ChatShopExe{

	public static void main(String[] ottp){

		ChatShop chat=new ChatShop();
		chat.addChatName("Pani puri");
		chat.addChatName("Masala puri");
		chat.addChatName("Masala Cheese Pori");
		chat.addChatName("Puff");
		chat.addChatName("Masala Pav Bhaji");
		chat.addChatName("Pani puri");
		//chat.addChatName("Vada Pav");
		chat.addChatName("Vada Pav");
		//chat.addChatName("katore chat");

		chat.getDisplay();

		String a=chat.search("Bheal pori");
		chat.deleteNames("Puff");


	}
}