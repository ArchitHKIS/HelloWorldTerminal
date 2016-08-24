import java.util.*;
import java.util.Scanner;
public class RNGmastermind {
	private static Scanner in;
	public static void main(String[] args)throws InterruptedException {
		  Random r = new Random();
		  float s;
		  in = new Scanner(System.in);
		  int poop = (r.nextInt(10-1)+1);
	for (int i = 0; i < 1; i++)
    {
        
        System.out.println("Enter a number from 1-9");
        s = in.nextFloat();
        if(poop == s) {
        	System.out.println("You are correct");
        	break;
        	}
        if(poop < s) {
        	System.out.println("Try again");
        	
        }
        if(poop > s) {
        	System.out.println("Try again");
        	
        }
    }
}
} 