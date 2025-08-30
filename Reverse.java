import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers that you want to reverse: ");
        int numbers = scan.nextInt();
        int reverse = 0;

        while(numbers > 0){
            int rem = numbers % 10;  // Extracting last digit
            reverse = reverse * 10 + rem;               // Reverse * 10 Because this adds a zero after the number then the rem added to
                                                       // that numbers appears like Reversing eg: 50 + 4 = 54
            numbers /= 10;
        }

        System.out.println("The Reversed Numbers are: "+reverse);
    }
}
