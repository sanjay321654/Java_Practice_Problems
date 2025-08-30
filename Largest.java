import java.util.Scanner;

public class Largest {
    static void largestNumber(float num1, float num2, float num3){
        float max = Math.max(Math.max(num1, num2), num3);
        System.out.println("Maximum number is: "+max);
//        if(num1 >= num2 && num1 >= num3){
//
//            System.out.println("Maximum Number is: "+num1);
//        } else if (num2 >= num1 && num2 >= num3) {
//
//            System.out.println("Maximum Number is: "+num2);
//        } else {
//
//            System.out.println("Maximum Number is: "+num3);
//        }


    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter the Second Number: ");
        float num2 = input.nextFloat();
        System.out.println("Enter the Third Number: ");
        float num3 = input.nextFloat();
        largestNumber(num1, num2, num3);
        input.close();

    }
}
