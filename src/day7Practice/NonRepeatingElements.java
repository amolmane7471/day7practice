package day7Practice;

import java.util.Scanner;

public class NonRepeatingElements {

	public static void main(String[] args) {
		boolean flag;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter elements of an array");
		for(int i=0;i<arr.length;i++)
		{
				arr[i] = sc.nextInt();	
		}	
		System.out.println("non-repeating elements are :");
		for(int i=0;i<arr.length;i++)
		{
			flag = false;
			for(int j=0;j<arr.length;j++)
			{
				if( i != j && arr[i] == arr[j])
				{
					flag = true;
				 break;
				}
				
			}
			if(flag == false)
				System.out.print(arr[i]+" ");
	
		}
		sc.close();
	}
}
