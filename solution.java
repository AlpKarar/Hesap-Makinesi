import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int n1, n2, select;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("First num: ");
        n1 = input.nextInt();
        
        System.out.print("Second num: ");
        n2 = input.nextInt();
        
        System.out.println("1- Summation\n2- Subtraction\n3- Multiplication\n4- Division");
        select = input.nextInt();
        
        switch(select) {
            case 1:
                System.out.println("Sum: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subt: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multip: " + (n1 * n2));
                break;
            case 4:
                double div = (double)n1 / n2;
                System.out.printf("Div: %.2f\n", div);
                break;
        }
    }
}

