package loops;
import java.util.*;
public class LargestOfThree {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter three numbers to check which is greater: ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a >= b && a >= c){
            System.out.print(a+" is greatest");
        }
        else if(b >= a && b >= c){
            System.out.print(b+" is greatest");
        }
        else{
            System.out.print(c+" is greatest");
        }
}
}
