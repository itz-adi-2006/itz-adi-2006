import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		double num1=0,num2=0;
		double result=0;
		char operator;
                String msg="Result for ";
		System.out.println("Welcome to our Calculator Program");
		System.out.println("1. Enter + to add two numbers");
		System.out.println("2. Enter - to subtract two numbers");
		System.out.println("3. Enter * to multiply two numbers");
		System.out.println("4. Enter / to divide two numbers");
		System.out.println("5. Enter % to take out the percent of two numbers");
		System.out.println("6. Enter i to take out the inverse of two numbers");
		System.out.println("Enter E to exit the calculator");
		
		Scanner ob=new Scanner(System.in);
		while(true)
		{

		    System.out.println("Enter your operator");
		    operator=ob.next().charAt(0);
		    if(operator=='E'||operator=='e')
		    {
		        System.out.println("Thanks for using the calculator");
		        break;
		    }
		   if(operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%'||operator=='i')
                   {
	            System.out.println("Enter First Number");
		    num1=ob.nextInt();
		    System.out.println("Enter Second Number");
		    num2=ob.nextInt();
		   }

		    if(operator=='+')
		    {
 			result=num1+num2;
		        System.out.println(msg+"addition is: "+result);
		        
		    }
		    else if (operator=='-')
		    {
		       result=num1-num2;
		       System.out.println(msg+"subtraction is: "+result); 
		    }
		    else if(operator=='*')
		    {
		       result=num1*num2;
		       System.out.println(msg+"multiplication is: "+result); 
		    }
		    else if(operator=='/')
		    {
		       result=num1 / num2;
		       System.out.println(msg+"division is: "+result); 
		    }
		    else if(operator=='%')
	            {
			result=num1/num2*100;
			System.out.println(msg+"percentage is:"+result);
	            }
		    else if(operator=='i')
	            {
			result=num2/num1;
			System.out.println(msg+"inverse is:"+result);
		    else
		    {
		        
		       System.out.println("Wrong choice"); 
		       break;
		    }
		    
		}
	}
}
