package loops;

public class lengtloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text= "my wonderfull text";
		for(int i=text.length()-1; i>=0;i--) {
			System.out.println(text.charAt(i));
		}
	}

}
