 class SpotifyExecutor{
    public static void main(String spotifyplatform[])
	{
        Spotify spotify= new Spotify();

        // Adding song names
		spotify.addSongName("Heeriye");
		spotify.addSongName("Challeya");
		spotify.addSongName("Chikkini chammeli");
		spotify.addSongName("Heeriye");
		spotify.addSongName("Tu Chale");
		spotify.addSongName("Chammak Challo");
		spotify.addSongName("Naah");
        spotify.addSongName("Dilko karaya");
        spotify.addSongName("Gollimata");
        spotify.addSongName("Pinga");

        // Getting and printing song names
        spotify.getSongNames();
		
		String songName = "Challeya";
      System.out.println("Searching for the Song Name " +songName);
      String sName=spotify.searchSongName(songName);
	  System.out.println(sName +" is found! thank you searching. " );
	  
	  
	  String song="Naah";
	boolean  deletedsong=spotify.deletedBySong(song);
	System.out.println("is " + song +" song deleted ? : " +deletedsong);
        
    }
}
