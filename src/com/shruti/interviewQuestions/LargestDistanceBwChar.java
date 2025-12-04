package com.shruti.interviewQuestions;

public class LargestDistanceBwChar {
    public static void main(String args[])
    {
        String s1= "geeksforgeeks";
        char target = 's';
        System.out.println(count(s1, target));
    }
    public static int count(String s1, char target)
    {

        int firstOccur =-1;
        int lastOccur =-1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == target) {
                if (firstOccur == -1) {
                    firstOccur = i;
                }
                lastOccur = i; // always update last occurrence
            }
        }
        return lastOccur-firstOccur;
    }
}

