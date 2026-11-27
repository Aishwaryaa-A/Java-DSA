package loops;
import java.util.*;
public class SimpleCalculator {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers to do operation: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.print("1 - Addition 2 - Subtraction 3 - multiplication 4 - Division");
        System.out.print("Enter your choice: ");
        int choice = s.nextInt();
        double c;
        switch(choice){
            case 1:  c = a + b;
                    System.out.print("sum = "+c);
                    break;
            case 2: c = a - b;
                    System.out.print("difference = "+c);
                    break;
            case 3: c = a * b;
                    System.out.print("Product= "+c);
                    break;
            case 4: if(b != 0){
                     c = a/b;
                System.out.print("Quotient= "+c);
            }
                    else{
                System.out.println("Division by zero is not possible");
            }

                    break;
            default: System.out.print("Enter valid choice");

        }
    }
}
