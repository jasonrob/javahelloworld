public class HelloWorld 
{    
	public static void main (String [] args) 
	{
		if (args.length > 0)        
			System.out.println("Hello World :) " + args[0]);
		else
			System.out.println("Hello World :(");
		System.exit(0);    
	} 
} 
