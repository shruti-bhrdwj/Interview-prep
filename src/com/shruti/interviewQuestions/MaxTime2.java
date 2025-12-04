package com.shruti.interviewQuestions;

import java.util.Arrays;

public class MaxTime2 {
    public static void main(String[] args) {
        int[] time = {0, 9, 2, 3}; // Example input, replace with Scanner input if needed

        Arrays.sort(time); // Sort in ascending order

        // Iterate from largest to smallest
        for (int i = 3; i >= 0; i--) {
            if (time[i] > 2) continue; // Skip invalid H1 values
            int h1 = time[i];

            for (int j = 3; j >= 0; j--) {
                if (j == i) continue; // Avoid reusing numbers
                if (h1 == 2 && time[j] > 3) continue; // If H1 is 2, H2 must be <= 3
                int h2 = time[j];

                for (int k = 3; k >= 0; k--) {
                    if (k == i || k == j) continue; // Avoid reusing numbers
                    if (time[k] > 5) continue; // M1 must be <= 5
                    int m1 = time[k];

                    int m2 = time[6 - i - j - k]; // The last remaining number

                    System.out.println("Maximum valid time: " + h1 + "" + h2 + ":" + m1 + "" + m2);
                    return;
                }
            }
        }

        System.out.println("No valid time can be formed.");
    }
}

