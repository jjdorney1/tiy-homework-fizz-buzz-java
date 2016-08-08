/**
 * Created by jeffreydorney on 8/5/16.
 */
public class FizzBuzz {

    public FizzBuzz(int start, int end) {
        for(int x = start; x <= end; x++){
            if(((x % 3) == 0) && ((x % 5) == 0)) {
                System.out.print( "FizzBuzz ");
            } else if(( (x % 3) == 0)) {
                System.out.print( "Fizz ");
            } else if(( (x % 5) == 0)) {
                System.out.print( "Buzz ");
            } else
                System.out.print( x + " " );
        }

        /*for(int x = start; x <= end; x++){
            System.out.print( start );
        }*/

    }
}
