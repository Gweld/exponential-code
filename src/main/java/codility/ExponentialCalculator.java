package codility;

import static codility.ExponentialLogNComplexityUtil.exponentLogComplexityIncremental;
import static codility.ExponentialLogNComplexityUtil.exponentLogComplexityRecursive;

public class ExponentialCalculator {

    public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.

        int xPositivePower = 2;
        int yPositivePower = 3;
        int resultPositivePower = 8;
        int result = exponent(xPositivePower, yPositivePower);
        if (result != resultPositivePower) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentRecursive(xPositivePower, yPositivePower, xPositivePower);

        if (result != resultPositivePower) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, yPositivePower);

        if (result != resultPositivePower) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityRecursive(xPositivePower, 6, 0, 6);

        if (result != 64) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(xPositivePower, 6);

        if (result != 64) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(xPositivePower, 8, 0, 8);

        if (result != 256) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(xPositivePower, 8);

        if (result != 256) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(xPositivePower, 10, 0, 10);

        if (result != 1024) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(xPositivePower, 10);

        if (result != 1024) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(xPositivePower, 12, 0, 12);

        if (result != 4096) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(xPositivePower, 12);

        if (result != 4096) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(xPositivePower, 14, 0, 14);

        if (result != 16384) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 14);

        if (result != 16384) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 2, 0, 2);

        if (result != 4) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(2, 2);

        if (result != 4) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(3, 4, 0, 4);

        if (result != 81) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(3, 4);

        if (result != 81) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(3, 3, 0, 3);

        if (result != 27) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(3, 3);

        if (result != 27) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityIncremental(3, 5);

        if (result != 243) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityRecursive(3, 5, 0, 5);

        if (result != 243) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(100, 0);

        if (result != 1) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(2, 4);

        if (result != 16) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityRecursive(2, 4, 0, 4);

        if (result != 16) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(2, 5);

        if (result != 32) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityRecursive(2, 5, 0, 5);

        if (result != 32) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(2, 6);

        if (result != 64) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityRecursive(2, 6, 0, 6);

        if (result != 64) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(2, 7);

        if (result != 128) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 7, 0, 7);

        if (result != 128) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 8);

        if (result != 256) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 8, 0, 8);

        if (result != 256) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 10);

        if (result != 1024) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 10, 0, 10);

        if (result != 1024) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 11);

        if (result != 2048) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 11, 0, 11);

        if (result != 2048) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 12);

        if (result != 4096) {
            throw new IllegalStateException("Incorrect result: " + result);
        }
        result = exponentLogComplexityRecursive(2, 12, 0, 12);

        if (result != 4096) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 13);

        if (result != 8192) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 13, 0, 13);

        if (result != 8192) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 14);

        if (result != 16384) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 14, 0, 14);

        if (result != 16384) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 15);

        if (result != 32768) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 15, 0, 15);

        if (result != 32768) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 16);

        if (result != 65536) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 16, 0, 16);

        if (result != 65536) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 17);

        if (result != 131072) {
            throw new IllegalStateException("Incorrect result: " + result);
        }


        result = exponentLogComplexityRecursive(2, 17, 0, 17);

        if (result != 131072) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 18);

        if (result != 262144) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 18, 0, 18);

        if (result != 262144) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 19);

        if (result != 524288) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 19, 0, 19);

        if (result != 524288) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityIncremental(xPositivePower, 20);

        if (result != 1048576) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        result = exponentLogComplexityRecursive(2, 20, 0, 20);

        if (result != 1048576) {
            throw new IllegalStateException("Incorrect result: " + result);
        }


        int xNegativePower = -2;
        int yNegativePower = 3;
        int resultNegativePower = -8;
        result = exponent(xNegativePower, yNegativePower);
        if (result != resultNegativePower) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        int xZeroPower = -2;
        int yZeroPower = 0;
        int resultPowerZero = 1;
        result = exponent(xZeroPower, yZeroPower);
        if (result != resultPowerZero) {
            throw new IllegalStateException("Incorrect result: " + result);
        }

        System.out.println("Calculations was correct");
    }

    private static int exponent(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int result = 1;

        for (int i = 0; i< y; i++) {
            result = result * x;
        }
        return result;
    }

    private static int exponentRecursive(int x, int y, int result) {
        if (y == 0) {
            return 1;
        }
        if (y == 1) {
            return result;
        }
        int powersLeft = y - 1;
        result = result * x;
        System.out.println("Current state: " + result + " for powersLeft: " + powersLeft);
        return exponentRecursive(x, powersLeft, result);
    }

}

