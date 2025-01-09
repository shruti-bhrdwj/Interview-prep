package com.shruti.interviewQuestions;

public class FindIfSubstring {
    public static void main(String[] args) {
        String s2 = "humans";
        String s1 = "man";
        System.out.println(isSubstring(s1,s2));
        System.out.println(isSubstr(s1,s2));
        System.out.println(isSubstr2(s1,s2));
    }
    //method1
    static int isSubstring(
            String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            int j;

            /* For current index i, check for
            pattern match */
            for (j = 0; j < M; j++)
                if (s2.charAt(i + j)
                        != s1.charAt(j))
                    break;

            if (j == M)
                return i;
        }

        return -1;
    }

    //method2
    public static int isSubstr(String s2, String s1){
        int counter = 0; //pointing s2
        int i = 0;
        for(;i<s1.length();i++){
            if(counter == s2.length())
                break;
            if(s2.charAt(counter)==s1.charAt(i)){
                counter++;
            }else{
                //Special case where character preceding the i'th character is duplicate
                if(counter>0){
                    i -= counter;
                }
                counter = 0;
            }
        }
        return counter < s2.length()?-1:i-counter;
    }

    //method3
    static int isSubstr2(String s1, String s2)
    {
        // using indexOf method to check if s1 is
        // a substring of s2
        return s2.indexOf(s1);
    }
}
