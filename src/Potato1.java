import java.util.Scanner;
public class Potato1{
public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
	potato potato = new potato();
	System.out.println("Enter Name: ");
	potato.setName(scanner.nextLine());
	
	System.out.println("Name: " + potato.getName());
	
}
}


