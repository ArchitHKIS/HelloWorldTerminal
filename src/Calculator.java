import java.util.Scanner;
public class Calculator {
	private static Scanner in;
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		in = new Scanner(System.in);
		System.out.println("Enter an integer");  
		 a = in.nextDouble();
		 System.out.println("Enter another integer");
		 b = in.nextDouble();
		 System.out.println("Press1 for +, 2 for -, 3 for * or 4 for /");
		 c = in.nextDouble();
		 if(c == 1){
			 System.out.println(a + b);}
		if(c == 2){
		 System.out.println(a-b);}
		if(c == 3){
			System.out.println(a*b);
		}
		if(c == 4){
			double g = a/b;
			System.out.println(g);
		}
		
		
			 
		 
	}

}
