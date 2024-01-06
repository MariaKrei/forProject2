package Project2A;

public class Car {
    /*Create a Class Car that would have the following fields: carPrice and color
and method calculateSalePrice() which should be returning a price of the
car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
and has its own implementation of calculateSalePrice() method in which
returned price is calculated as following: if weight>2000 then returned price
car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it is own implementation
of calculateSalePrice(): if length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discount*/
    private String carColor;
    private double carPrice;
    public Car(String color, double carPrice){
        this.carPrice=carPrice;
        this.carPrice=carPrice;
    }
    public double calculatePrice(){
        System.out.println("Price for this car is "+carPrice);
        return carPrice;
    }

    public double getCarPrice() {
        this.carPrice = carPrice;
        return carPrice;
    }
}

class Sedan extends Car{
    double length;
    public Sedan(String color, double carPrice, double length){
        super(color,carPrice);
        this.length=length;
    }

    @Override
    public double calculatePrice() {
        double cost=getCarPrice();
        if (length>20){
            return cost-((cost/100)*5);
        }else{
            return cost-((cost/100)*10);
        }

    }
}
class Truck extends Car{
    double weight;
    public Truck(String color, double carPrice, double weight){
        super(color,carPrice);
        this.weight=weight;
}

    @Override
    public double calculatePrice() {
        double cost = getCarPrice();
        if (weight > 2000) {
            return cost- ((cost / 100) * 10);
        } else
            return cost - ((cost / 100) * 20);
    }
}

class CarTester{
    public static void main(String[] args) {
        Car[] carArr={new Sedan("gray", 10000, 15), new Truck("white", 100000, 1900)};
        for (Car a:carArr){
            System.out.println("The price for your car included discount will be  "+ a.calculatePrice());
        }
    }
}
