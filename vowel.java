package test;
import java.util.Scanner;
public class vowel
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char p=sc.next().charAt(0);
		System.out.println("given character=="+p);
		if(p=='a'||p=='e'||p=='i'||p=='o'||p=='u')
		{
		System.out.println("The given character is  vowel");
		}
		else
		{
		System.out.println("character is alphabet");
		}
		}
}
