class SpotiyaExecutor{

        public static void main(String[] args) {
        // Create an instance of Spotiya
        Spotiya spotiya = new Spotiya();

        // Add song names
        spotiya.addSongName("Saptha sagaradhache Ello ");
        spotiya.addSongName("Ninnidale Ninnidale");
        spotiya.addSongName("E sundhara beledingala");
        spotiya.addSongName("Venmathiye venmathiye");
        spotiya.addSongName("usire Usire");
        spotiya.addSongName("Yaroo kannalli");
        spotiya.addSongName("Summane yake bande");
        spotiya.addSongName("kanassugarana ondhu kanasu");
        spotiya.addSongName("Singara siriye");
        spotiya.addSongName("Basanni baa");
		spotiya.addSongName("Singara siriye");

        // Display the playlist
        spotiya.displaySongs();
    }
}