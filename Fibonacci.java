import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scan.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count < n){
            int next = a + b; // next fib
            a = b;
            b = next;

            count ++;
            System.out.println(b);

        }
        scan.close();

    }
}
