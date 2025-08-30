import java.util.Scanner;

public class Age_problem {
    static void conditions(int age){
        if(age <= 13){
            System.out.println("You are a Child");
        }else if(age >=14 && age <=19){
            System.out.println("You are a Teenager");
        } else if (age >=20 && age <60) {
            System.out.println("You are a Adult");
        }else{
            System.out.println("You are a Senior Citizen");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your present age: ");
        int inputs = scan.nextInt();
        conditions(inputs);

    }
}

