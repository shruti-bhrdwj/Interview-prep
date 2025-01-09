package com.shruti.dsa;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Shruti";
        char target = 'r';
        boolean ans = search(name,target);
        System.out.println(ans);
        boolean ans2 = search2(name,target);
        System.out.println(ans2);
        boolean ans3 = search3(name,target,1,4);
        System.out.println(ans3);
    }

    //search using for loop
    static boolean search(String name, char target) {
        if(name.length() == 0){
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if( name.charAt(i) == target ){
                return true;
            }
        }
        return false;
    }

    //search using foreach
    static boolean search2(String name, char target) {
        if(name.length() == 0){
            return false;
        }

        for (char ch : name.toCharArray()) {
            if( ch == target ){
                return true;
            }
        }
        return false;
    }

    //search in some range
    static boolean search3(String name, char target, int start,int end) {
        if(name.length() == 0){
            return false;
        }

        for (int i = start; i <= end; i++) {
            if( name.charAt(i) == target ){
                return true;
            }
        }
        return false;
    }
}
