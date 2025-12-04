package com.shruti.interviewQuestions;

import java.util.Arrays;

public class MaxTime {
    public static void main(String[] args) {
        int[] time = {1, 9, 1, 2}; // Example input, replace with Scanner input if needed

        Arrays.sort(time); // Sort in ascending order

        StringBuilder maxTime = new StringBuilder();

        // Finding the first digit (H1)
        for (int i = 3; i >= 0; i--) {
            if (time[i] <= 2) {
                maxTime.append(time[i]);
                time[i] = -1; // Mark as used
                break;
            }
        }

        // Finding the second digit (H2)
        for (int i = 3; i >= 0; i--) {
            if (time[i] != -1 && maxTime.charAt(0) == '2' && time[i] <= 3) { // If H1 is 2, H2 must be <= 3
                maxTime.append(time[i]);
                time[i] = -1;
                break;
            } else if (time[i] != -1 && maxTime.charAt(0) != '2') { // If H1 is 0 or 1, H2 can be 0-9
                maxTime.append(time[i]);
                time[i] = -1;
                break;
            }
        }

        maxTime.append(":");

        // Finding the third digit (M1)
        for (int i = 3; i >= 0; i--) {
            if (time[i] != -1 && time[i] <= 5) { // M1 can be 0-5
                maxTime.append(time[i]);
                time[i] = -1;
                break;
            }
        }

        // Finding the fourth digit (M2)
        for (int i = 3; i >= 0; i--) {
            if (time[i] != -1) {
                maxTime.append(time[i]);
                break;
            }
        }

        /*if (maxTime.length() == 5 )*/System.out.println("Maximum valid time: " + maxTime.toString());
        /*else System.out.println("-1");*/
    }
}