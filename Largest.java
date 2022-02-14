package test;

public class Largest 
{
	public static void main(String[] args)
	{
		Double n1=-2.0,n2=4.8,n3=-6.5,largestnumber;
		if(n1>=n2)
		{
		if(n1>=n3)
		{largestnumber=n1;
		}
		else
		{
		largestnumber=n3;
		}
		}
		else
		{
		if(n2>=n3)
		{
		largestnumber=n2;
		}
		else
		{
		largestnumber=n3;
		}
		}
		System.out.println("Largestnumber:"+largestnumber);
	}

}
