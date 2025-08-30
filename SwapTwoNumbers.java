import java.util.Scanner;

public class SwapTwoNumbers {
    static void swapNumbers(int numberOne, int numberTwo){
        System.out.println("Before Swap: "+numberOne+" "+numberTwo);
        int temp_Three;
        temp_Three = numberOne;
        numberOne = numberTwo;
        numberTwo = temp_Three;
        System.out.println("After Swap: "+numberOne+" "+numberTwo);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = scan.nextInt();
        swapNumbers(num1, num2);
    }
}

