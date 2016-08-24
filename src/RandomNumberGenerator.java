import java.util.*;
import java.util.Scanner;
public class RandomNumberGenerator {
	
	public static Scanner ui;
	public static void main(String args[]) {
		Random r = new Random();
		float h;
		//String a;
		int g;
		boolean w;
		ui = new Scanner(System.in);
		int f = r.nextInt(10 - 1) + 1;
		// Random 10 numbers from 0 to 1000
		for(int i=0;i<10;i++){

			System.out.println("What's your guess? ");
			g = ui.nextInt();
			if (g > f){
				System.out.println("Your guess is larger than the number");
			}
			if (g < f){
				System.out.println("Your guess is less than the number");
			}

			if (g == f){
				System.out.println("Your guess is the number! Congrats!");
				break;
			}
			
		}
	}

}