package Project2A;

import java.util.ArrayList;

public class Task10 {
    public static void main(String[] args) {
        ArrayList<String> carModel=new ArrayList<>();
        carModel.add("Astra");
        carModel.add("Escalade");
        carModel.add("Amigo");
        carModel.add("At4");
        carModel.add("Sunterra");
        carModel.add("Escalade");
        carModel.add("Amigo");
        System.out.println("The original list :");
carModel.forEach(x-> System.out.println(x));

        for (int i = 0; i <carModel.size() ; i++) {
            for (int j = i+1; j <carModel.size(); j++) {
                if (carModel.get(i).equals(carModel.get(j))){
                    carModel.remove(j);
                }

            }


        }System.out.println("The list after  duplicates were removed ");
        carModel.forEach(x-> System.out.println(x));

    }
}
