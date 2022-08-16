package day7Practice;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int count = 0, num ;
		    System.out.println("Enter any num: ");
		    num = sc.nextInt();
		    while (num != 0) {
		      num /= 10;
		      ++count;
		    }

		    System.out.println("Number of digits: " + count);
		  }

}
