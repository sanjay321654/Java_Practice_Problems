import java.util.Scanner;

public class SwapwithoutTemp {
    static void withoutTempSwap(int a, int b){
        System.out.println("Before swap: "+a+" " +b);
        // Let a = 20, b = 10
        a = a + b;     // a = 20 + 10 = 30
        b = a - b;     // b = 30 - 10 = 20
        a = a - b;     // a = 30 - 20 = 10
        System.out.println("After swap: "+a+" "+b);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int input1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        int input2 = scan.nextInt();
        withoutTempSwap(input1, input2);

    }
}

