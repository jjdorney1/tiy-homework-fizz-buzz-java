/**
 * Created by jeffreydorney on 8/5/16.
 */
public class FizzBuzz {

    public void doIt(int start, int end) {
        for(int x = start; x <= end; x++){
            if(((x % 3) == 0) && ((x % 5) == 0)) {
                System.out.println("FizzBuzz ");

            } else if(( (x % 3) == 0)) {
                System.out.println("Fizz ");

            } else if(( (x % 5) == 0)) {
                System.out.println("Buzz ");

            } else
                System.out.println( String.valueOf(x) + " ");
        }

        /*for(int x = start; x <= end; x++){
            System.out.print( start );
        }*/
        //return "";
    }
}
