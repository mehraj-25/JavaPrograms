import java.util.*;

public class Arr_Merge
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int a1[]=new int[size];
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		
		System.out.println("Enter size of 2nd array");
		int size1=sc.nextInt();
		System.out.println("Enter elements");
		int a2[]=new int[size1];
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextInt();
		}
		
		int a3[]=new int[a1.length+a2.length];//new array to combine
		
		//Copy elements from 1st array.
		for(int i=0;i<a1.length;i++)
		{
			a3[i]=a1[i];
		}
		//Copy elements from 1st array.
		for(int i=0;i<a2.length;i++)
		{
			a3[a1.length+i]=a2[i];
		}
		//Print merged array
		for (int i = 0; i < a3.length; i++) {
            System.out.print(a3[i] + " ");
        }
	}
}

