package com.skillstorm;

public class ArrayHelpers {

    public static int findMaxOld(int[] inputArray) throws NullPointerException {

        int result = 0;

        for (int n : inputArray) {
            try {
                if (n > result)
                    result = n;

            } catch (NullPointerException e) {
                System.out.println("Invalid input; please use something other than null.");
            }
        }
        System.out.print("The largest number in your array is: ");
        return result;

    }

    public static int findMax(int[] numbers) throws NullPointerException {
        if (numbers == null)
            return 0;

        int result = 0;

        for (int n : numbers) {
            if (n > result)
                result = n;
        }
        return result;

    }

}
