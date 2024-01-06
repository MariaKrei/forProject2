package Project2A;

public class Task7 {
    public static void main(String[] args) {
        String a="I love Java and Selenium!I will love them forever.I really do.";
        String[] array=a.split(" ");
        String[] array1=a.split(".");
        String[] array2=a.split("!");
        int result=array.length+array1.length+array2.length;
        System.out.println(result);
    }}



