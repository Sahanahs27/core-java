class Spotiya {

    String songNames[] = new String[11];
    int index;

    // Method to add a song name to the array
    public boolean addSongName(String songName) {
        boolean isAdded = false;
        if (songName != null) {
            songNames[index] = songName;
            index++;
            isAdded = true;
        }
        return isAdded;
    }

    // Method to display the list of song names
    public void displaySongs() {
        System.out.println("Spotiya Playlist:");
        for (int index = 0; index < songNames.length; index++) {
            System.out.println(songNames[index] + " is added successfully");
        }
    }

   
}
