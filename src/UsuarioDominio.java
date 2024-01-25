

	import java.util.Scanner;

	public class UsuarioDominio {

		public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Whats your email adress?");
			
			String adress= sc.nextLine();
			
			
			
			String user= adress.substring(0, adress.indexOf("@"));
			String domain= adress.substring(adress.indexOf("@")+1);
			
			System.out.println("your user is: "+ user);
			System.out.println("your domain is: "+ domain);
			
			sc.close();
		}

	}


