/**
 * Created by jeffreydorney on 8/5/16.
 */
public class Main {
    public static void main(String[] args) {

        for(int x = 1; x <= 100; x++){
            if(((x % 3) == 0) && ((x % 5) == 0)) {
                System.out.print( "FizzBuzz ");
            } else if(( (x % 3) == 0)) {
                System.out.print( "Fizz ");
            } else if(( (x % 5) == 0)) {
                System.out.print( "Buzz ");
            } else
            System.out.print( x + " " );
        }



        //FizzBuzz fizzBuzz = new FizzBuzz(1, 100);


    }
}