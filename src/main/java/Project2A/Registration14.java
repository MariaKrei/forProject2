package Project2A;

public class Registration14 {
    /*Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName*/
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        this.email = email;
        String email1=email.toLowerCase();
        if (email1.contains("yahoo")){
            System.out.println("Your email is "+email);

        }else{
            System.out.println("Wrong email. Use yahoo");
        }
    }

    public void setUserName(String userName) {
      this.userName=userName;
        boolean isEmpty=userName.isEmpty();
        int length=userName.length();
        if (!isEmpty&&length>=6) {
            System.out.println("Your User name was set as " + userName);
        }else{
            System.out.println("Username cannot be empty and less then 6 characters ");
        }
    }


    public void setPassword(String password) {
      boolean pas=password.contains(userName);
        boolean isEmpty=password.isEmpty();
        int length=password.length();
        if (!isEmpty&&length>=6&&!pas){
            System.out.println("Your password is "+password);
        }else{
            System.out.println("Your passwort cannot be empty and less than 6 characters and it cannot contain username");
        }
    }
}
 class RegistrationTester {
    public static void main(String[] args) {
        Registration14 a=new Registration14();

        a.setEmail("maria27@google.com");
        a.setUserName("maria123");
        a.setPassword("123456");


    }
}

