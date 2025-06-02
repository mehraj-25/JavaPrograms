import java.util.*;

public class Arr_Palindrome
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size ");
		int size=sc.nextInt();
		
		System.out.println("Enter elements");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		int end=a.length-1;
		int mid=a.length/2;
		
		for(int start=0;start<mid;start++)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			end--;
		}
		
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Palindrome");
		}else{
			System.out.println("Not palindrome");
		}
		
	}
}