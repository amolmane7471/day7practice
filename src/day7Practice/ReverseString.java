package day7Practice;
import java.util.*;
class ReverseString {
   
	public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string to be reversed:");
        String s = sc.nextLine();   
        String reverse = "";
 for(int i = s.length() - 1; i >= 0; i--)
 {
 reverse = reverse + s.charAt(i);
 }
 System.out.println("The reversed string is:");
 System.out.print(reverse);
    }
}