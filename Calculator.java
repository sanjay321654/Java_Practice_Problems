import java.util.Scanner;

public class Calculator {
    static void calculation(float num1, float num2, char symbol){
        switch (symbol){
            case '+' :
                System.out.println("Addition of two numbers : "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction of two numbers : "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers : " +(num1*num2));
                break;
            case '/':
                if(num2 !=0) {
                    System.out.println("Division of two numbers : " + (num1 / num2));
                }else {
                    System.out.println("Try another Number: Division of Zero gives Infinity!! ");
                }
                break;
            case '%':
                if(num2 !=0) {
                    System.out.println("Remainder of two numbers : " + (num1 % num2));
                }else {
                    System.out.println("Try another Number: Division of Zero gives Infinity!! ");
                }

                break;
            default:
                System.out.println("Invalid: Enter Operator from these symbols: +, -, *, /, % ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        float input1 = scan.nextFloat();

        System.out.println("Enter Operator (+, -, *, /, %): ");
        char input3 = scan.next().charAt(0);
                                                //We put 0 inside charAt(0) because we want the first character from the input string.
                                                //  Without it, Java won’t convert String → char directly

        System.out.println("Enter the Second Number: ");
        float input2 = scan.nextFloat();


        calculation(input1, input2, input3);
        scan.close();
    }

}

