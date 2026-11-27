package loops;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number;
        System.out.print("Enter the number to check: ");
        number = s.nextInt();
        if(number % 2 == 0 ){
            System.out.print(number+" is even");
        }
        else{
            System.out.print(number+" is odd");
        }
    }
}
