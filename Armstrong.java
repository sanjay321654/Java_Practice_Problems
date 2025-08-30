/*An Armstrong number (also called narcissistic number) is a number that is equal to the sum of its own digits
raised to the power of the number of digits.
 Example:
153 → has 3 digits.
= 1**3 + 5***3 + 3**3 = 153 ✅ Armstrong */

import java.util.Scanner;


public class Armstrong {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number that " +
                "you want to check whether its armstrong or not: ");
        int num = scan.nextInt();
        int original = num;
        int power = 0;
        int sum = 0;


        // To find number of digits

        int temp = num;
        if(temp == 0){
            power = 1;
        }
        while (temp > 0){
            power ++;      // Increment digit count
            temp /= 10;    // Remove last digit

        }

        //Calculate Sum of Powers

        temp = num;
        while (temp > 0){
            int digit = temp % 10;        // Extract last digit
            sum += (int) Math.pow(digit, power) ; // Add digit^count to sum
            temp /= 10;                   // Remove last digit
        }

        // Checking if armstrong or not

        if(original == sum){
            System.out.println(original + " is an Armstrong Number! ");
        }else {
            System.out.println(original + " is not an Armstrong number! ");
        }



    }
}
