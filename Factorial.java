import java.util.Scanner;

public class Factorial {
    static void factorialCalculation(int num1){
        long fact = 1;
        for(int i =1; i <= num1; i++ ){
            fact = fact * i;
        }
        System.out.println("factorial of "+num1+" "+"is "+fact);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int input = scan.nextInt();
        factorialCalculation(input);
        scan.close();
    }
}
