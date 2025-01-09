package com.shruti.interviewQuestions;

public class LargestDistanceBwChar {
    public static void main(String args[])
    {
        String str= "geeksforgeeks";
        char c = 'e';
        System.out.println(count(str, c));
    }
    public static int count(String s, char c)
    {
        int res = 0;
        int max =0;
        int firstOccur =0;
        int lastOccur =0;

        for (int i=0; i<s.length(); i++)
        {
            // checking character in string
            if (s.charAt(i) == c)
                res++;
            if(res==1) {
                firstOccur = s.indexOf( s.charAt(i));
            }
            if(res > max) {
                max = res;
            }
            if(res==max){
                lastOccur = s.indexOf( s.charAt(i));
            }
        }
        return lastOccur-firstOccur;
    }
}

