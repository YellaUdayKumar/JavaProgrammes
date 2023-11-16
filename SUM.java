import java.util.Scanner;

public class SUM 
{

	public static void main(String[] args) 
	{
		do 
		{
			
			 Scanner sc = new Scanner(System.in);
			 System.out.println("enter any two  number");
			 int a =sc.nextInt();
			 int b =sc.nextInt();
			 
			 int sum=a+b;
			 System.out.println("sum of two numbers is: " +sum);
		
		      System.out.println("Do you want to continue for another Employee if yes input 1");
				
		      int choice=sc.nextInt();
				if(choice!= 1)
				{
				break;
				}
		}while(true);
		

	}

}
