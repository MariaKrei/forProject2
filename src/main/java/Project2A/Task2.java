package Project2A;

public class Task2 {
    public static void main(String[] args) {
        String abc="HelloAsgHar123456708#$%&*()";
        String a=abc.replaceAll("[^A-Za-z]","");
        System.out.println(a.length());
    }
}
