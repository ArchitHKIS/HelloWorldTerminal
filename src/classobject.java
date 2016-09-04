import java.util.Scanner;

public class classobject {
private static Scanner in;
public class Puppy{

	   public Puppy(String name){
	      
	      System.out.println("Passed Name is :" + name ); 
	   }
		public void main(String[] args){
		String name;
		System.out.println("What is your name");
		// enter your name
		name = in.nextLine();
		System.out.println("Name" + name);
		
	}

}
}