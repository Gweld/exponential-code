package codility;

public class ExponentialLogNComplexityUtil {


    public static int exponentLogComplexityRecursive(int x, int y, int counter, int initialPower) {
        if (y == 0) {
            System.out.println("All steps value was: " + counter + "for power base: " + initialPower);
            return 1;
        }
        int result = exponentLogComplexityRecursive(x, y/2, counter + 1, initialPower);
        if (y%2 == 1) {
            return result * result * x;
        }
        return result * result;
    }
    public static int exponentLogComplexityIncremental(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int result = 1;
        int counter = 1;
        int base = y;
        while (y >= 1) {
            if (y%2 == 1) {
                result = result * x;
            }
            x = x * x;
            counter++;
            y = y/2;
        }
        System.out.println("All steps number for increment way was: " + counter + " for base: " + base);
        return result;
    }
}
