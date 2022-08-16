package day7Practice;
import java.util.Scanner;
public class ArmStrong {

public static void main(String[] args) {
	int digit,armNum = 0 ,sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Number");
    int num = sc.nextInt();
	int temp = num;
    sc.close();
	while(num > 0)
	{
	digit = num % 10;
	num = num / 10;
	armNum = (int) Math.pow(digit, 3);
	System.out.print(digit+"^3: "+armNum+"  ");
	sum = sum + armNum;
	}
	
	System.out.println("Total= "+sum);
	if (sum == temp)
		System.out.println(temp+" is a armstrong number");
	else
		System.out.println(temp+" is not a armstrong number");
	}
	
}
