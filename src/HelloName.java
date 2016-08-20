import java.util.Scanner;
public class HelloName {
	public static void main(String args[]) throws InterruptedException
	   {
	      String s;
	      
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter your name");
	      s = in.nextLine();
	      System.out.println(s+": Open the pod bay doors, please, Hal...Open the pod bay doors, please, Hal...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?...Do you read me, Hal?...Hullo, Hal, do you read me?...Hullo, Hal, do you read me?...Do you read me, Hal?");
	      Thread.sleep(10000);
	      System.out.println("Hal: Affirmative," +s+ " I read you.");
	      Thread.sleep(3000);
	      System.out.println(s+": Open the pod bay doors, Hal.");
	      Thread.sleep(3000);
	      System.out.println("Hal:I'm sorry, " +s+", I'm afraid I can't do that.");
	      Thread.sleep(3000);
	      System.out.println(s+": What's the problem?");
	      Thread.sleep(3000);
	      System.out.println("Hal: I think you know what the problem is just as well as I do.");
	      Thread.sleep(3000);
	      System.out.println(s+": What're you talking about, Hal?");
	      Thread.sleep(3000);
	      System.out.println("Hal: This mission is too important for me to allow you to jeopardise it.");
	      Thread.sleep(3000);
	      System.out.println(s+": I don't know what you're talking about, Hal.");
	      Thread.sleep(3000);
	      System.out.println("Hal: I know that you and Frank were planning to disconnect me, and I'm afraid that's something I cannot allow to happen.");
	      Thread.sleep(5000);
	      System.out.println(s+": Where the hell'd you get that idea, Hal?");
	      Thread.sleep(3000);
	      System.out.println("Hal:" +s+", although you took very thorough precautions in the pod against my hearing you, I could see your lips move.");
	      Thread.sleep(3000);
	      System.out.println(s+": Alright, Hal. I'll go in through the emergency airlock.");
	      Thread.sleep(3000);
	      System.out.println("Hal: Without your space- helmet, " +s+ ", you're going to find that rather difficult.");
	      Thread.sleep(3000);
	      System.out.println(s+": Hal, I won't argue with you any more. Open the doors.");
	      Thread.sleep(3000);
	      System.out.println("Hal: "+s+ ", this conversation can serve no purpose any more. Goodbye.");
	      Thread.sleep(3000);
	      System.out.println(s+ ": Hal? Hal. Hal. Hal! Hal!");
	      
	    
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   }
	}