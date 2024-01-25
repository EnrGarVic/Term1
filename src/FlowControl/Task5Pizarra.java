package FlowControl;

import java.util.Scanner;

public class Task5Pizarra {

	public static void main(String[] args) {
		// SAY IF A CYRCLE IS HIGHT OR NOT "DAN" "DAW" "ASIR"
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("whats your cycle?");
		 
		 String cfgs= sc.nextLine();
		 
		 if (cfgs.equalsIgnoreCase("dam") || cfgs.equalsIgnoreCase("daw") || cfgs.equalsIgnoreCase("asir") ) {
			 
			 System.out.println("its high");
			 
			 
		 }else {
			 System.out.println("not high");
		 }
		 sc.close();
		

	}

}
