import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    static void calculation(float num1, float num2, char symbol){
        switch (symbol){
            case '+' :
                System.out.println("\nAddition of two numbers : "+(num1+num2));
                break;
            case '-':
                System.out.println("\nSubtraction of two numbers : "+(num1-num2));
                break;
            case '*':
                System.out.println("\nMultiplication of two numbers : " +(num1*num2));
                break;
            case '/':
                if(num2 !=0) {
                    System.out.println("\nDivision of two numbers : " + (num1 / num2));
                }else {
                    System.out.println("\nTry another Number: Division of Zero gives Infinity!! ");
                }
                break;
            case '%':
                if(num2 !=0) {
                    System.out.println("\nRemainder of two numbers : " + (num1 % num2));
                }else {
                    System.out.println("\nTry another Number: Division of Zero gives Infinity!! ");
                }

                break;
            default:
                System.out.println("\nInvalid: Enter Operator from these symbols: +, -, *, /, % ");
        }



    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userChoice;          //Variables declared inside a block {} are only accessible within that block.
                                    // Once the {} is reached, the variable is destroyed.
                                    //Because of this we declare userChoice outside the do if we declare inside the do
                                    //then it cannot be accessible by the while.
        do {

            System.out.println("\nEnter the first number: ");
            float input1 = scan.nextFloat();

            System.out.println("Enter Operator (+, -, *, /, %): ");
            char input3 = scan.next().charAt(0);
                                 //We put 0 inside charAt(0) because we want the first character from the input string.
                                //  Without it, Java won’t convert String → char directly

            System.out.println("Enter the Second Number: ");
            float input2 = scan.nextFloat();


            calculation(input1, input2, input3);

            System.out.println("\nDo you want to continue the calculation: yes or no - ");
            userChoice = scan.next().toLowerCase(Locale.ROOT);

        }while (userChoice.equals("yes") || userChoice.equals("y"));

        System.out.println("\nThank You Using the Calculator!!");



        scan.close();
    }

}



