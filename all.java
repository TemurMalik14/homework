import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Please input a , b , c ");
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	
	int max = a;
	if(b > max) max = b;
	if(c > max) max = c;
	System.out.println("this is max number " +max);
	}
}
