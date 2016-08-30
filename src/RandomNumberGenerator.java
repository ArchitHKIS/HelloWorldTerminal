import java.util.*;
public class RandomNumberGenerator{;
private static Scanner in;
public static void main(String[] args){
	  Random r = new Random();
	  float s;
	  in = new Scanner(System.in);
	  int poop = (r.nextInt(10-1)+1);
	  int poop1 = (r.nextInt(10-1)+1);
	  int poop2 = (r.nextInt(10-1)+1);
	  int poop3 = (r.nextInt(10-1)+1);
for (int i = 0; i < 80; i++)
{
	System.out.println(poop);
	System.out.println(poop1);
	System.out.println(poop2);
	System.out.println(poop3);
    System.out.println("Enter a number from 1-9");
    s = in.nextFloat();
    float s1 = in.nextFloat();
    float s2 = in.nextFloat();
    float s3 = in.nextFloat();
    
    if(poop == s && poop1 == s1 && poop2 == s2 && poop3 == s3) {
    	System.out.println("You are correct HeHe XD");

    	}
    if(poop > s && poop1 == s1 && poop2 == s2 && poop3 == s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop < s && poop1 == s1 && poop2 == s2 && poop3 == s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop > s && poop1 == s1 && poop2 == s2 && poop3 == s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop == s && poop1 > s1 && poop2 == s2 && poop3 == s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop == s && poop1 < s1 && poop2 == s2 && poop3 == s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop == s && poop1 == s1 && poop2 > s2 && poop3 == s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop == s && poop1 == s1 && poop2 < s2 && poop3 == s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop == s && poop1 == s1 && poop2 == s2 && poop3 > s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop == s && poop1 == s1 && poop2 == s2 && poop3 < s3){
    	System.out.println("You have 1 wrong");
    }
    if(poop != s && poop1 != s1 && poop2 == s2 && poop3 == s3){
    	System.out.println("You have 2 wrong");
    }
    if(poop != s && poop1 == s1 && poop2 != s2 && poop3 == s3){
    	System.out.println("You have 2 wrong");
    }
    if(poop != s && poop1 == s1 && poop2 == s2 && poop3 != s3){
    	System.out.println("You have 2 wrong");
    }
    if(poop == s && poop1 != s1 && poop2 != s2 && poop3 == s3){
    	System.out.println("You have 2 wrong");
    }
    if(poop == s && poop1 != s1 && poop2 == s2 && poop3 != s3){
    	System.out.println("You have 2 wrong");
    }
    if(poop == s && poop1 != s1 && poop2 != s2 && poop3 != s3){
    	System.out.println("You have 3 wrong");
    }
    if(poop != s && poop1 == s1 && poop2 != s2 && poop3 != s3){
    	System.out.println("You have 3 wrong");
    }
    if(poop != s && poop1 != s1 && poop2 == s2 && poop3 != s3){
    	System.out.println("You have 3 wrong");
    }
    if(poop != s && poop1 != s1 && poop2 != s2 && poop3 == s3){
    	System.out.println("You have 3 wrong");
    }
    if(poop != s && poop1 == s1 && poop2 != s2 && poop3 != s3){
    	System.out.println("You have 3 wrong");
    }
    if(poop != s && poop1 != s1 && poop2 != s2 && poop3 != s3){
    	System.out.println("You have 3 wrong");
    }

}
    
}
}
 