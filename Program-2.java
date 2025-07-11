import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a integer value");
		int a=sc.nextInt();
		int t=0;
		
			for(int i=1;i<=a;i++)
			{
				System.out.print(i+i-1+" ");
			}
		
	}

}
