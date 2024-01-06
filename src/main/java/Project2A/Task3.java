package Project2A;

public class Task3 {
    public static void main(String[] args) {
        String hi="Hello Asghar";
        String count="";
        for (int i = hi.length()-1; i >=0 ; i--) {
            count=count+hi.charAt(i);

        }
        System.out.println(count);
    }
}
