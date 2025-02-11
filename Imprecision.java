
/**
 * This program demonstrates imprecision when using large numbers.
 * @author Joshua Solomon, joshuatsolomon@gmail.com
 * @since 2/6/25 (Joshua Solomon, v1.0)
 * @version V1.0
 */
public class Imprecision
{
    public static void main(String[] args) {
        double x, y, z;
        
        x = 12345.6789e200;
        y = 1/x;
        z = x*y;
        
        System.out.println("The value of x is: " + x);
        System.out.println("The value of y is: " + y);
        System.out.println("The value of z is: " + z);
        System.out.println("The value of 1-z is: " + (1-z));
    }
}