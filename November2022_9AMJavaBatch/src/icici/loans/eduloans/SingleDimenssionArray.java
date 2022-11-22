package icici.loans.eduloans;

import java.util.Scanner;

public class SingleDimenssionArray 
{

	public static void main(String[] args) 
	{
		/*int[] x = {10,20,30,40};
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"]="+x[i]);
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Size : ");
		int asize = sc.nextInt();
		
		int[] a = new int[asize];
		int sum = 0;
		
		System.out.println("Enter the array Elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
			System.out.println("a["+i+"]="+a[i]);
			sum = sum + a[i];
		}
		System.out.println("Sum of array is : " +  sum);
		
		
		int[] x = new int[] {10,20,30,40};
	}

}
