import java.util.*;
abstract class RBI
{
	abstract double withdraw(double amount);
	abstract double deposite(double amount);
	abstract double loan(double amount,int year);
}
class SBI extends RBI
{
	static Scanner sc=new Scanner(System.in);
	double balance=10000;
	double withdraw(double amount)
	{
		if(balance>=amount)
        	{
			double x3=amount*(2.5/100);
            		balance =(balance-amount)-x3;
            		System.out.println("Transaction successfull \n withdrawn amount INR "+(amount+x3));
			System.out.println();
        	}
        	else
		{
            		System.out.println("Insuffient funds \n press 1 for deposit or press any number to exit");
			System.out.print("Enter choise: ");
            		int n=sc.nextInt();
            		if(n==1)
            		{
                		System.out.println("please enter deposit amount");
                		deposite(sc.nextDouble());
            		}
        	}
        return balance;
	}
	 double deposite(double amount)
	{
		System.out.println("please wait while we are depositing your amount");
        	balance=balance+amount;
		System.out.println();
        	return balance;
	}
	double loan(double amount,int year)
	{
		double x3=((int)amount*year*10)/100;
		double x4=(double)x3/(year*12);
		System.out.println();
		return x4;
	}
}
class Kotak  extends RBI 
{
	static Scanner sc=new Scanner(System.in);
	double balance=10000;
	double withdraw(double amount)
	{
		if(balance>=amount)
        	{
			double x3=amount*(2.5/100);
            		balance =(balance-amount)-x3;
            		System.out.println("Transaction successfull \n withdrawn amount INR "+(amount+x3));
        	}
        	else
		{
            		System.out.println("Insuffient funds \n press 1 for deposit or press any number to exit");
            		int n=sc.nextInt();
            		if(n==1)
            		{
                		System.out.println("please enter deposit amount");
                		deposite(sc.nextDouble());
            		}
        	}
	System.out.println();
        return balance;
		
	}
	 double deposite(double amount)
	{
		
		System.out.println("please wait while we are depositing your amount");
        	balance=balance+amount;
		System.out.println();
        	return balance;
	}
	double loan(double amount,int year)
	{
		double x3=((int)amount*year*10)/100;
		double x4=(double)x3/(year*12);
		System.out.println();
		return x4;
		
	}
}
class User2
{
	static Scanner sc=new Scanner(System.in);
	static SBI x=new SBI();
	static Kotak y=new Kotak();
	public static void main(String[]args)
	{
		User2 z=new User2();
		System.out.println();
		System.out.println("Enter Login Credentials");
		Main.main(args);
		choise();
		
	}
	static void choise()
	{
		System.out.println("Press 1 for SBI \nPress 2 for Kotak");
		System.out.println();
		System.out.print("Enter choise: ");
		int x1=sc.nextInt();
		if(x1==1)
		{
			System.out.println();
			System.out.println("Press 1 for withdraw \nPress 2 for deposite \nPress 3 for loan");
			System.out.println();
			System.out.print("Enter choise: ");
			System.out.println();
			int x2=sc.nextInt();
			if(x2==1)
			{
				System.out.print("Enter Withdraw Amount: ");
				
				System.out.println("Available Balance: "+x.withdraw(sc.nextDouble()));
			}
			else if(x2==2)
			{
				System.out.print("Enter Deposite Amount: ");
				
				System.out.println("Available Balance: "+x.deposite(sc.nextDouble()));
			}
			else if(x2==3)
			{
				System.out.print("Enter Loan Amount: ");
				double amount=sc.nextDouble();
				System.out.print("Enter Duration in years: ");
				int years=sc.nextInt();
				System.out.println();
				System.out.println("EMI per month: "+y.loan(amount,years));
			}	
			
		}
		else
		{
			System.out.println();
			System.out.println("Press 1 for withdraw \nPress 2 for deposite \nPress 3 for loan");
			System.out.println();
			System.out.print("Enter choise: ");
			int x2=sc.nextInt();
			if(x2==1)
			{
				System.out.print("Enter Withdraw Amount: ");
				System.out.println("Available Balance: "+y.withdraw(sc.nextDouble()));
			}
			else if(x2==2)
			{
				System.out.print("Enter Deposite Amount: ");
				System.out.println("Available Balance: "+y.deposite(sc.nextDouble()));
			}
			else if(x2==3)
			{
				System.out.print("Enter Loan Amount: ");
				double amount=sc.nextDouble();
				System.out.print("Enter Duration in years: ");
				int years=sc.nextInt();
				System.out.println();
				System.out.println("EMI per month: "+y.loan(amount,years));
			}	
			
		}
	}

}
class app
{
	private String username="Manasa";
	private String pw="Suresh@28";
	private long phno =9347451082l;
	void s1(String username)
	{
		this.username=username;
	}
	void s2(String pw)
	{
		this.pw=pw;
	}
	void s3(long phno)
	{
		this.phno=phno;
	}
	String g1()
	{
		return username;
	}
	String g2()
	{
		return pw;
	}
	long g3()
	{
		return phno;
	}
}
class Main
{
	static Scanner sc=new Scanner(System.in);
	static User2 x1=new User2();
	static app x=new app();
	static String reset="\u001B[0m";
	static String bold="\u001B[1m";
	static String blink="\u001B[5m";
	static String red="\u001B[31m";
	static String green="\u001B[32m";
	static String yellow="\u001B[33m";
	static String blue="\u001B[34m";
	static String purple="\u001B[35m";
	static String cyan="\u001B[36m";
	static String white="\u001B[37m";
	static String whitebg="\u001B[47m";
	static String back ="\u001B[30m";
	static int c=0;
	public static void main(String[]args)
	{
		/*System.out.println();
		System.out.printf("%75s%n",whitebg+red+blink+bold+"Welcome to our Online Portal"+reset);
		System.out.println();
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
		}*/
		details();
	}
	static void details()
	{
		System.out.printf("%70s%n",green+"Already have an account....? press 1 to signin ");
		System.out.printf("%73s%n",red+"Are you a new user.........? press 2 to sign up"+reset);
		System.out.println();
		System.out.print("Enter your choise: ");
		int x2=sc.nextInt();
		if(x2==1)
		{
			login();
		}
		else if(x2==2) 
		{
			signup();
		}
		else
		{
			System.out.println("Invalid User Input \nPlease Provide valid Input");
			details();
		}
			
		System.out.println();
		User2 u=new User2();
		System.out.println();
		if(c==0)
		{
			System.out.println("  ****************************************************************************   ");
			System.out.println();
		}
	}
	static void login()
	{
		System.out.println(blue+"Enter user name and password");
		System.out.print(white+"NAME    : ");
		String name=sc.next();
		System.out.print(white+"PASSWORD: ");
		String pasw=sc.next();
		
		if(name.equals(x.g1()) && pasw.equals(x.g2()))
		{
			System.out.println();
			System.out.printf("%70s%n",blue+whitebg+"login Successful"+reset);
		}
		else if(!(name.equals(x.g1())) || !(pasw.equals(x.g2())))
		{
			System.out.println();
			System.out.println(red+"Invalid user Name or Password");
			System.out.println();
			System.out.println(blue+"Enter Mobile Number");
			System.out.println();
			System.out.print(blue+"MOBILE: ");
			long mobile=sc.nextLong();
			if(mobile==x.g3())
			{
				int otp=1000+(int)(Math.random()*8999);
				System.out.println(otp);
				System.out.println(green+"OTP sent to your mobile  Successfully");
				System.out.println();
				System.out.print(white+"Enter OTP: ");
				int a=sc.nextInt();
				if(otp==a)
				{
					System.out.println();
					System.out.println("Your User Name: "+x.g1());
					System.out.println("Your Password : "+x.g2());
					System.out.println();
					System.out.println(green+bold+"Login Successful"+reset);
					//u.onlinefood();
				}
				else
				{
					System.out.println();
					System.out.println(red+bold+"You Entered OTP is Wrong"+reset);
					System.out.println();
					System.out.println(white+"press 1 to login \npress any key to exit");
					int x1=sc.nextInt();
					if(x1==1)
					{
						login();
					}
					else
						c++;
				}
			}
			else
			{
				System.out.println();
				System.out.println(red+"User not found");
				System.out.println(white+bold+"Do You Wanna continue or Exit....?"+reset);
				System.out.println(cyan+"Press 1 to Continue or any key to exit");
				int a1=sc.nextInt();
				if(a1==1)
				{
					login();
				}
				else
					c++;
			}
		}
	}
	static void signup()
	{
		
		System.out.println(cyan+"Enter Your name");
		System.out.println();
		System.out.print(white+"NAME    : ");
		x.s1(sc.next());
		System.out.println();
		System.out.println(cyan+"Enter password");
		System.out.print(white+"PASSWORD: ");
		x.s2(sc.next());
		System.out.println();
		while(true)
		{
			System.out.print(blue+"Enter Mobile Number: "+reset);
			x.s3(sc.nextLong());
			System.out.println();
			int otp=1000+(int)(Math.random()*8999);
			System.out.println(otp);
			System.out.println(white+"OTP sent to your mobile  Successfully");
			System.out.println();
			System.out.print(white+"Enter OTP: ");
			int a=sc.nextInt();
			System.out.println();
			if(otp==a)
			{
				System.out.printf("%70s%n",blue+whitebg+"Your Account is Created Successfully"+reset);
				System.out.println();
				login();
				break;
			}
			else
			{
				System.out.println(red+bold+blink+"You Entered OTP is Wrong TRY AGAIN"+reset);
				System.out.println();
			}
		}
	}
}