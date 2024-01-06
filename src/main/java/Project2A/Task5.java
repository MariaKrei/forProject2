package Project2A;

import java.util.Arrays;

public class Task5 { public static void main(String[] args) {
    String a="moda";
    String b="dome";
    a=a.toLowerCase();
    b=b.toLowerCase();
    if (a.length()==b.length()){
        char[] charArray1=a.toCharArray();
        char[] charArray2=b.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean result=Arrays.equals(charArray1, charArray2);
        if (result){
            System.out.println(a+" and "+b+" are anagrams");
        }else{
            System.out.println(a+" and "+b+" are not anagrams");
        }

    }else{
        System.out.println("This is not an anagram");
    }}
}

