class Ottplatform1Executor
{
public static void main(String ottp[])
{
Ottplatform1 ottplatform =new Ottplatform1();
ottplatform.addMoviesName("Appu");
ottplatform.addMoviesName("Arasu");
ottplatform.addMoviesName("Ugram");
ottplatform.addMoviesName("Power");
ottplatform.addMoviesName("Appu");
ottplatform.addMoviesName("Arasu");
ottplatform.addMoviesName("KirikParty");
ottplatform.getMoviesName();

String mName = "Power";
System.out.println("Searching for the movie " +mName);
String movieName= ottplatform.searchByMovieName(mName);
System.out.println(movieName +" is found! thank you  for searching");

 String mdName="KirikParty";
 boolean  deletedMovie=ottplatform.deletedByMovie(mdName);
System.out.println(  "is " + mdName +" movie deleted ?  " +deletedMovie);
}
}