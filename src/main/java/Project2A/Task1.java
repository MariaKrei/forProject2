package Project2A;

public class Task1 {

    public static void main(String[] args) {
        String name1="Maria";
        String name2="Eva";
        System.out.println("Name1 before swaping is "+name1+" and name2 before swaping is "+name2);
        name1=name1+name2; //mariaEva
        name2=name1.substring(0, name1.length()-name2.length());
        name1=name1.substring(name2.length());
        System.out.println("Name1 after swaping is "+name1+" and name2 before swaping is "+name2);


    }
}
