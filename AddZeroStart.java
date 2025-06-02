/*1) Add Zero to Start of Array

Write a Java program to take an array of integers as input and move all zeros to the start while maintaining the order of other elements.
Add Zero to End of Array

Implement a Java program that moves all zeros in an array to the end while keeping the order of non-zero elements unchanged.
*/

import java.util.*;

public class AddZeroStart
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an elements");
		int n=sc.nextInt();

		System.out.println("Enter elements in an array");
		int a[]=new int[n];

		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				for(int j=i;j>0;j--)
				{
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		System.out.println("Array after moving all zeros at start");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}
}
