import java.util.Scanner;

public class Temperature {
    static void celsiusToFahrenheit(float celsius){
        float fahrenheit =  (celsius * 9/5 ) + 32;       //Formula - F = (C * 9/5) + 32
        System.out.println("Converted Fahrenheit value: "+fahrenheit);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the current celsius value: ");
        float inputs = scan.nextFloat();
        celsiusToFahrenheit(inputs);

    }
}
