import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) 
	{
		Problem m=new Problem();
		Scanner sc=new Scanner(System.in);
	    System.out.println("Please enter value for number1 and number2");	
	    double n1=sc.nextDouble();
	    double n2=sc.nextDouble();
	    while(true)
	    {
	    System.out.println("1.add");
	    System.out.println("2.sub");
	    System.out.println("3.mul");
	    System.out.println("4.div");
	    System.out.println("Enter your choice");
	    int n=sc.nextInt();
	    System.out.println();
	    switch(n)
	    {
	    case 1:m.add(n1,n2);
	           	break;
	    case 2:m.sub(n1,n2);
        		break;
	    case 3:m.mul(n1,n2);
        		break;
	    case 4:m.div(n1,n2);
        		break;
        		
        		default:System.exit(0);
	    }	    
	}
	}
}
 class Problem 
{
	Scanner s=new Scanner(System.in);
      public void add(double n1,double n2)
	{
		System.out.println(n1+n2);
	}
	public void sub(double n1,double n2)
	{
		System.out.println(n1-n2);
	}
	public void mul(double n1,double n2)
	{
		System.out.println(n1*n2);
	}
	public void div(double n1,double n2)
	{
		System.out.println(n1/n2);
	}
}
