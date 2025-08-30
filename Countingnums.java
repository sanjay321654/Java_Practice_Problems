public class Countingnums {
    //9,223,372,036,854,775,807
    public static void main(String[] args){
        long numbers = 9223372036854775807L;
        int count = 0;

        while(numbers > 0){
            long rem = numbers % 10;   // To Extract the last digit

            if(rem == 7){
                count ++;

            }
            numbers /= 10;  // numbers = numbers/10; // To Remove the last digit

        }
        System.out.println("The Answer is: "+count);
    }
}
