class Modulus1{
   
   public static void main(String mod[]){
    mod (150 , 69, 115);
	mod (190 , 120);
	mod (250 , 99);
	mod (390 , 67, 78);
	mod (57 , 34);
	mod (245 , 49);
	mod (34 , 57, 99);
	mod (66 , 78);
	mod (99 , 18);
	mod (112 , 44, 224);
	mod (78 , 12);
	mod (77 , 30);
	mod (445 , 65);
	mod (50 , 39, 330);
	mod (848 , 66);
	mod (89 , 67);
	mod (87 , 34, 156);
	mod (734 , 76);
	mod (100 , 10);
	mod (567 , 20, 115);
   }
	
    public static void mod(int a, int b)
	{
	 System.out.println(a%b);
	}
     
	public static void mod(int a, int b, int c)
	{
	 System.out.println(a%b%c);
	}
 }