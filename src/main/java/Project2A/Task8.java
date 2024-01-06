package Project2A;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {


    ArrayList<String>  carModel=new ArrayList<>();
    carModel.add("Astra");
    carModel.add("Escalade");
    carModel.add("Amigo");
    carModel.add("At4");
    carModel.add("Sunterra");
    for (String a:carModel){
        a=a.toLowerCase();
        if (a.startsWith("a")){
            System.out.println(a);
        }
    }

    }
}
