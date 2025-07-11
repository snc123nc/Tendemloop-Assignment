import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a integer value");
		int a=sc.nextInt();
		int t=0;
		if(a%2==0)
		{
			for(int i=1;i<=a-1;i++)
			{
				System.out.print(i+i-1+" ");
			}
		}
		else
		{
			for(int i=1;i<=a;i++)
			{
		    System.out.print(i+i-1+" ");
			}
		}
	}
}
