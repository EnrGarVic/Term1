package term1;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stubfeSS
		int a=70, b=73, c=2;
		if(b*b-4*a*c<0) {
			System.out.println("raiz negativa");
			
		}else if((b*b-4*a*c==0)){
			
			double x=-b/2*a;
			System.out.println("the result of x is: "+x);
		}
		else {
			double x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("the result of x1 is:"+x1);

			double x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
			System.out.println("the resul of x2 is:"+x2);
		}

	}

}
