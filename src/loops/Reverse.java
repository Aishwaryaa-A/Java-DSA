package loops;
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to reverse: ");
        int a = s.nextInt();
        int result = 0;
        while(a > 0){
            int digit = a % 10;
            result = result * 10 + digit;
            a = a / 10;
        }
        System.out.println("Reversed number = " + result);
    }
}
