package loops;
import java.util.*;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to find prime or not: ");
        int a = s.nextInt();
        int rem;
        int count = 0;
        for(int i = 2; i < a ; i++ ){
            rem = a % i;
            if(rem == 0) {
               count++;
            }
        }
           if(a < 2 || count > 0){
               System.out.print(a+" is not a prime");
           }
           else{
               System.out.println(a + " is a prime");
           }

    }
}
