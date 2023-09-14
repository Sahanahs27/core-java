class CricketTeam {

    String playerNames[] = new String[11];
    int index;

    public boolean addPlayerName(String playerName) {
        
        boolean isAdded = false;
        if (playerName != null && index < playerNames.length) {
            playerNames[index] = playerName;
            index++;
            isAdded = true;
        }
        return isAdded;
    }

    // Method to display the list of player names
    public void displayPlayers() {
        System.out.println("Cricket Team Players:");
        for (int index = 0; index < playerNames.length; index++) {
            System.out.println(playerNames[index] + " is added Successfully");
        }
    }

  
}

