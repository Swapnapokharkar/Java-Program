package test;
import java.util.Scanner;
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		if(a%2==0)
		System.out.println("Number:"+a+"iseven");
		else
			System.out.println("number:"+a+"isodd");
	}

}
