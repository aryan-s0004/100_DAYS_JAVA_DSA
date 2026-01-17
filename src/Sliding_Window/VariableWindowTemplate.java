package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class VariableWindowTemplate {

    /*
     * VARIABLE SIZE SLIDING WINDOW TEMPLATE (RUNNABLE VERSION)
     * --------------------------------------------------------
     * This version uses a dummy condition so it compiles.
     * Replace condition logic based on problem.
     */

    public static int variableWindow(int[] arr) {

        int left = 0;
        int result = 0;

        int sum = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {

            // EXPAND
            sum += arr[right];
            freq.put(arr[right], freq.getOrDefault(arr[right], 0) + 1);

            // SHRINK (dummy condition for compilation)
            while (sum > Integer.MAX_VALUE) { // never true, safe placeholder
                sum -= arr[left];
                freq.put(arr[left], freq.get(arr[left]) - 1);

                if (freq.get(arr[left]) == 0) {
                    freq.remove(arr[left]);
                }
                left++;
            }

            // UPDATE RESULT
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Window size = " + variableWindow(arr));
    }
}
