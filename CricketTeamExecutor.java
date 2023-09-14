class CricketTeamExecutor{

       public static void main(String cricket[]) {
    
        CricketTeam cricketTeam = new CricketTeam();

        // Add player names
        cricketTeam.addPlayerName("virat kohli");
        cricketTeam.addPlayerName("Rohith sharma");
        cricketTeam.addPlayerName("K L rahul");
        cricketTeam.addPlayerName("M S Dhoni");
        cricketTeam.addPlayerName("Ardhik pandey");
        cricketTeam.addPlayerName("Rishab panth");
        cricketTeam.addPlayerName("Shreyash");
        cricketTeam.addPlayerName("Sachin tendulkar");
        cricketTeam.addPlayerName("Mohammed");
        cricketTeam.addPlayerName("Chahal");
		cricketTeam.addPlayerName("ABD");

        // Display the list of player names
        cricketTeam.displayPlayers();
    }
}