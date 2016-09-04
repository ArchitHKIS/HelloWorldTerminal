import java.util.Scanner;
public class Potato1{
	private static Scanner in;
	private static Scanner scanner;
public static void main(String [] args){
	scanner = new Scanner(System.in);
	in = new Scanner(System.in);
	potato potato = new potato();
	System.out.println("Enter Name: ");
	potato.setName(scanner.nextLine());
	
	System.out.println("Name: " + potato.getName());
	System.out.println("Enter size: ");
	potato.setsize(scanner.nextInt());
	
	System.out.println("Size: " + potato.getsize());
	System.out.println("Print final results?");
	String s = in.nextLine();
	if (s == "final"){
		System.out.println("Name: " +potato.getName());
		System.out.println("Size: " +potato.getsize());	
	}	
}
}


