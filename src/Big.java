/**
 * Created by Allie on 9/9/14.
 */
import java.math.BigInteger;

public class Big {

    public static BigInteger factorial(int n){
        while (n!=0){
            BigInteger result = BigInteger.valueOf(n).multiply(factorial(n-1));
            return result;
        }
        return BigInteger.valueOf(1);
    }


    public static void main(String[] args) {

        int n = 0;

        while (n <= 100){
            System.out.println(n + "! = " + factorial(n));
            n++;
        }



    }

}
