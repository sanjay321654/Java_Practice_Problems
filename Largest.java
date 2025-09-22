import java.util.Scanner;

public class Largest {
    static void largestNumber(float num1, float num2, float num3){
        // float max = Math.max(Math.max(num1, num2), num3);
        // System.out.println("Maximum number is: "+max);
           float largest = num1;
        if(num2 > largest){
            largest = num2;
        }
        if(num3 > largest){
            largest = num3;
        }

        System.out.println("Maximum number is: "+largest);


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

