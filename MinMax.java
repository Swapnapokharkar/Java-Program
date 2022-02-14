package test;
import java.util.Scanner;
public class MinMax 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter The Number:");
		int a=sc.nextInt();
		if(a>0)
		System.out.println("Number is positive:");
		else
			System.out.println("Number is negative");
	}

}
