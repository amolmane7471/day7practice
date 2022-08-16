package day7Practice;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		boolean flag;
		Scanner sc = new Scanner(System.in);
        System.out.println("enter start number:");
        int start = sc.nextInt();
        System.out.println("enter end number:");
        int end = sc.nextInt();
        for(int i=start;i<=end;i++)
        {
        	if(i == 1)
        		continue;
        	flag = true;
        	for(int j=2;j<=i/2;j++)
        	{
        	if(i % j == 0)
        	{
        	flag = false;
             break;
        	}
        	}
        if(flag == true)
        {
        	System.out.println(i);
        }
        }
        sc.close();
	}

}
