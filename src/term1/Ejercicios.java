package term1;

public class Ejercicios {

	public static void main(String[] args) {
    char a='b';
    System.out.println(a);
    char b = 'c';
    System.out.println(b);
    a = b;
    System.out.println(a);
    String adress2= "avd/gaspar aguilar";

  System.out.println(adress2.indexOf("/"));
		  System.out.println(adress2.substring(0, adress2.indexOf("/")));
		  System.out.println(adress2.substring(adress2.indexOf("/")+1));
		  
		  String test = "abcdefg";
		    System.out.println(test.substring(3));
        
	}

}
