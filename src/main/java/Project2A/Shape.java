package Project2A;

public interface Shape {
    /*Create an Interface 'Shape' with undefined methods as calculateArea and
calculatePerimeter. Create 2 classes Circle & Square that implements
functionality defined in the Shape Interface. Test your code.*/



    double calculateArea(int side,  int radius);
    double calculatePerimeter(int side, int radius);
}
class Circle implements Shape{
    @Override
   public double calculateArea(int side,int radius ) {
        double p=3.14;
        return p*(radius*radius);



    }

    @Override
    public double calculatePerimeter(int side,int radius ) {
        double p=3.14;
        return 2*p*radius;
    }
}
class Square implements Shape{
    @Override
    public double calculateArea(int side,int radius ) {
        return side*side;
    }

    @Override
    public double calculatePerimeter(int side,int radius ) {
        return 4*side;
    }
}
