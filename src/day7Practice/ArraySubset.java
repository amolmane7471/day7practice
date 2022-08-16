package day7Practice;
import java.util.Scanner;
public class ArraySubset {
	 static boolean isSubset(int arr1[], int arr2[], int m, int n)
	 {
	 int i = 0;
	 int j = 0;
	 for (i = 0; i < n; i++) {
	 for (j = 0; j < m; j++)
	if (arr2[i] == arr1[j])
		break;
	if (j == m)
		return false;
	 }
	return true;
	 }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements ");
		int i,j;
		int m = sc.nextInt();
		int[] arr1 = new int[m];
		System.out.println("enter elements of an array 1:");
		for( i=0;i<m;i++)
		{
				arr1[i] = sc.nextInt();	
		}
		
		System.out.println("enter number of elements ");
		int n = sc.nextInt();
		int[] arr2 = new int[n];
		System.out.println("enter elements of an array 2:");
		for( j=0;j<n;j++)
		{
				arr2[j] = sc.nextInt();	
		}
		
		if (isSubset(arr1, arr2, m, n))
		System.out.print("arr2[] is "   + "subset of arr1[] ");
		else
			System.out.print("arr2[] is " + "not a subset of arr1[]");
		}
	
}
