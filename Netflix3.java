class Netflix3 {

    static String kannadaMovies[] = {"Gaja","Akash","kranthi","Mourya","Yuvaratna","Nalla","Ranna","Musanjemathu","Modalasala","Lucky","Googly","Kiss","suntaragali","kirik-party","K.G.F","kirataka","kariya","Boss","Yajamana","Charli 777","Kantara","kanasugara","Appu","Ranadhira","James"};
    static String englishSeries[] = {"King the Land","Money Heist","Hidden Love","Heartstopper","Lucifer","The Vampire Diaries","Ozark","Black mirror","Dark","Stranger things","Wednesday","The Crown","The Good Fight","The Last Kingdom","Orange Is the New Black","The hunt of Virappan","True Beauty","The Witcher","Friends","Picky Blinders"};
	static String hindiSeries[] = {"Sacred Games","Scoop","Delhi Crime","Aranyak","Decoupled","Ray","Taj Mahal","Masaba Masaba","Jamtara","Ghoul","Selection day","Bard of Blood","She","Khakee","Cat"};
	static String teluguMovies[] = {"Magadheera","Arya","Brindaavanam","Pournami","Ala Modalaindi","Darling","Athadu","Sachien","Ra Cha","Okkadu","Bommarillu","Oh My Friend","RRR","Rangastalam","Pushpa","Dhruva","Custody","Pokiri","Paiyaa","Dasara","Sita ramam","Julayi","God father","Dookudu","Dhamaka"};
	static String malayalamMovies[] = {"Sandesham","Thoovanathumbikal","Kireedam","Kilukkam","Premam","Bharatham","Manichitrathazhu","Amaram","Celluloid","Spadikam","Chithram","Nadodikattu","Mathilukal","Yavanika","Vidheyan","Bangalore Days","Chechi","pada","hridayam","nayattu","Ustad hotel","salute","Ayisha","Puzhu","Iratta"};
	
	 public static void main(String netflix2[]){
		   
	 System.out.println("Main started");
	 
	 for(int index=0; index < kannadaMovies.length; index--)
	 {
	  System.out.println(kannadaMovies[index]);
	 }
	 
	 for(int index=0; index < englishSeries.length; index++)
	 {
	  System.out.println(englishSeries[index]);
	 }
	
	 for(int index=0; index < hindiSeries.length; index++)
	 {
	  System.out.println(hindiSeries[index]);
	 }
	 
	 for(int index=0; index < teluguMovies.length; index++)
	 {
	  System.out.println(teluguMovies[index]);
	 }
	
	 for(int index=0; index < malayalamMovies.length; index++)
	 {
	  System.out.println(malayalamMovies[index]);
	 }
	 System.out.println("Main ended");
	  }
}