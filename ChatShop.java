class ChatShop {

    String chatNames[] = new String[10];
    int index;

    // create/add/save
    public boolean addChatName(String chatName) {
        boolean isAdded = false;
        if (chatName != null) {
            chatNames[index] = chatName;
            index++;
            isAdded = true;
        }
        return isAdded;
    }

    public void getChatNames() {
        System.out.println("The list of chat names are:");
        for (int index = 0; index < chatNames.length; index++) {
            System.out.println(chatNames[index] + " is added Successfully");
        }
    }

}
