class SuperMar{

     static String chocolates[] = {"dairymilk","kitkat","perk","darkfantasy","dairysilk","cadberry","kaccha mango","kopiko","milkybar","boubon","dairy silk","munch","mango","black cookies","dark chocolate"};
	 static String biscuits[] = {"parle","hobnob","rusk","unibic","goodday","mariegold","oreo","patanjali","bourbon","custard cream","shortbread","scones","nice biscuits","anzac","jammie dodgers"};
	 static String icecream[] = {"strawberry","chocolate","red velvet","rich coffee","vanilla","kajudraksh","kesar pista","lonavalli","pista malai","bonanza","fresh pineapple","orange tang","black currant","butter coach","cookie cream"};
	 static String snacks[] = {"samosa","bhel puri","dahipuri","panipuri","dabeli","paprichat","dhokla","dahi vada","vada pav","kachori","pakora","aloo chat","banana chips","shankarpali","aloo tikki"};
	 static String vegetables[] = {"potato","tamoto","beans","brinjal","cucumber","cabbage","carrot","peas","radish","cauliflower","bottle gourd","pumpkin","broccoli","spinach","drumstick"};
	 static String fruits[] = {"apple","mango","pomegranate","grape","banana","pineapple","watermelon","orange","jackfruit","strawberry","peach","cherry","pear","lime","apricot"};
	 static String softdrinks[] = {"fanta","sprite","sting","slice","mazaa","seven up","thumps up","mirinda","pepsi","cocacola","mountain dew","limca","frooti","campa cola","appy fizz"};
	 static String perfumes[] = {"chanel","calvin klein","burberry","fogg","hugo","guerlain","miss dior","allure","eternity","aramis","angel","dianadulce","floral oasis","clinique","goutal"};
	 static String soaps[] = {"santoor","lifebuoy","dove","mysore sandal","johnson babysoap","pears","lux","himalaya","patanjali","swatik","medimix","neem","cinthol","kesh nikhar","hamam"};
	 static String groceries[] = {"rice","egg","butter","moongdal","basmati rice","chana dal","cracked wheat","puffed rice","masoordal","beans","cumin seeds","turmeric powder","onion seeds","nutmeg","uraddal"};


     public static void main(String market[]){
	 
	 getChocolates();
	 getReverseChocolates();
	 getBiscuits();
	 getReverseBiscuits();
	 getIcecream();
	 getReverseIcecream();
	 getSnacks();
	 getReverseSnacks();
	 getVegetables();
	 getReverseVegetables();
	 getFruits();
	 getReverseFruits();
	 getSoftdrinks();
	 getReverseSoftdrinks();
	 getPerfumes();
	 getReversePerfumes();
	 getSoaps();
	 getReverseSoaps();
	 getGroceries();
	 getReverseGroceries();
	 }
	 
	 public static void getChocolates(){
	 for(int choco=0; choco<chocolates.length; choco++){
	 System.out.println(chocolates[choco]);
	 }
	 }
	 
	 public static void getReverseChocolates(){
	 for(int choco=chocolates.length-1; choco>=0; choco--){
	 System.out.println(chocolates[choco]);
	 }
	 System.out.println("-------------------");
	 }
	 
	 public static void getBiscuits(){
	 for(int bis=0; bis<biscuits.length; bis++){
	 System.out.println(biscuits[bis]);
	 }
	 }
	 
	 public static void getReverseBiscuits(){
	 for(int bis=biscuits.length-1; bis>=0; bis--){
	 System.out.println(biscuits[bis]);
	 }
	 }
	  
	 public static void getIcecream(){
	 for(int ice=0; ice<chocolates.length; ice++){
	 System.out.println(icecream[ice]);
	 }
	 }
	 public static void getReverseIcecream(){
	 for(int ice=icecream.length-1; ice>=0; ice--){
	 System.out.println(icecream[ice]);
	 }
	 }
	 
	 public static void getSnacks(){
	 for(int snac=0; snac<snacks.length; snac++){
	 System.out.println(snacks[snac]);
	 }
	 }
	 public static void getReverseSnacks(){
	 for(int snac=snacks.length-1; snac>=0; snac--){
	 System.out.println(snacks[snac]);
	 }
	 }
	 
	 public static void getVegetables(){
	 for(int veg=0; veg<vegetables.length; veg++){
	 System.out.println(chocolates[veg]);
	 }
	 }
	 public static void getReverseVegetables(){
	 for(int veg=vegetables.length-1; veg>=0; veg--){
	 System.out.println(vegetables[veg]);
	 }
	 }
	 
	 public static void getFruits(){
	 for(int fru=0; fru<fruits.length; fru++){
	 System.out.println(fruits[fru]);
	 }
	 }
	 public static void getReverseFruits(){
	 for(int fru=fruits.length-1; fru>=0; fru--){
	 System.out.println(fruits[fru]);
	 }
	 }
	 
	  public static void getSoftdrinks(){
	 for(int soft=0; soft<softdrinks.length; soft++){
	 System.out.println(softdrinks[soft]);
	 }
	 }
	 public static void getReverseSoftdrinks(){
	 for(int soft=softdrinks.length-1; soft>=0; soft--){
	 System.out.println(softdrinks[soft]);
	 }
	 }
	 
	  public static void getPerfumes(){
	 for(int per=0; per<perfumes.length; per++){
	 System.out.println(perfumes[per]);
	 }
	 }
	 public static void getReversePerfumes(){
	 for(int per=perfumes.length-1; per>=0; per--){
	 System.out.println(perfumes[per]);
	 }
	 }
	 
	 public static void getSoaps(){
	 for(int soa=0; soa<soaps.length; soa++){
	 System.out.println(soaps[soa]);
	 }
	 }
	 public static void getReverseSoaps(){
	 for(int soa=soaps.length-1; soa>=0; soa--){
	 System.out.println(soaps[soa]);
	 }
	 }
	 
	 public static void getGroceries(){
	 for(int gro=0; gro<groceries.length; gro++){
	 System.out.println(groceries[gro]);
	 }
	 }
	 public static void getReverseGroceries(){
	 for(int gro=groceries.length-1; gro>=0; gro--){
	 System.out.println(groceries[gro]);
	 }
	 }
	 
	 
	 
	 
 }










