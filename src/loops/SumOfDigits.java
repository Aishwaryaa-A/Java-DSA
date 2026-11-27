package loops;
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to add it's digit: ");
        int a = s.nextInt();
        int sum = 0;
        while( a > 0){
            int digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
        System.out.println("Sum of digits = " + sum);
  }
}
