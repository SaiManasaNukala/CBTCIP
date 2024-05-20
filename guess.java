import java.util.*;
class Main
{
	public static void main(String[] args)
	{
	    String reset="\u001B[0m";
	    String bold="\u001B[1m";
	    String blink="\u001B[5m";
	    String red="\u001B[31m";
	    String green="\u001B[32m";
	     String yellow="\u001B[33m";
	    String blue="\u001B[34m";
	     String purple="\u001B[35m";
	    String cyan="\u001B[36m";
	    //String back ="\u001B[104m";
	      String whitebg="\u001B[47m";
	    Scanner sc=new Scanner(System.in);
	    Random r=new Random();
	    int num=r.nextInt(100);
		int w=0;
	        int c=0;
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(whitebg+red+blink+bold+"\t\t\t\t\t\t\t********** TRY TO GUESS THE NUMBER **********"+reset);
		System.out.println();
		System.out.println();	
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
		}
	        System.out.println(blue+bold+"\t\t\t\t\t\t\t\tGUESS A NUMBER BETWEEN 0 TO 100");
		System.out.println(yellow+"\t\t\t\t\t\t\t\t(You Have Only Three Chances To Win)"+reset);
		System.out.println();
	        while(true){
	            c++;
		System.out.print("Enter Your Number: ");
    	        int n=sc.nextInt();
		
    	        if(n==num)
    	        {
		    try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
		}
		    System.out.println();
    	            System.out.println(green+"YAYY YOU WON");
			w++;
		    System.out.println();
    	            break;
    	        }
    	        else if(n<num)
    	        {
		    try{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
		}
			System.out.println();
    	            System.out.println(yellow+"GUESS IS TOO LOW PLEASE TRY HIGHER NUMBER"+reset);
		    System.out.println();
    	        }
    	        else{
		     try{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
		}
			System.out.println();
    	            System.out.println(cyan+"GUESS IS TOO HIGH TRY LOWER NUMBER"+reset);
	            System.out.println();
    	        }
    	        if(c==3)
    	        {
	            try{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
		}
			System.out.println();
    	           System.out.println(purple+"YOU LOOSE BETTER LUCK NEXT TIME!!"+reset);
			System.out.println();
    	            break;
    	        }
	        }
	          try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println();
	         System.out.println(red+"CORRECT NUMBER: "+num+reset);
		 System.out.println();	    
	}
}