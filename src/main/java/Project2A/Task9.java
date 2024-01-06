package Project2A;

public class Task9 {
    public static void main(String[] args) {


            String str = "mariafmaria";
            for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i), i + 1) == -1) {
                    System.out.println("First non-repeating character is: " + str.charAt(i));
                    break;
                }
            }
        }
                    
                }

