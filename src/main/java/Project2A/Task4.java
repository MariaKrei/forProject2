package Project2A;

import java.util.Arrays;

public class Task4 {
    void isPalindrome (String x){
        String reverse="";
        for (int i = x.length()-1; i>=0; i--) {
            reverse=reverse+x.charAt(i);
        }if (x.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
}

    public static void main(String[] args) {
        Task4 m=new Task4();
        m.isPalindrome("madam");

    }}



