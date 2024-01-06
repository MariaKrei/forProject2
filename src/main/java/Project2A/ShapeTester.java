package Project2A;

public class ShapeTester {
    public static void main(String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        double areaCircle=c.calculateArea(0, 15);
        double perimCircle=c.calculatePerimeter(0,15);
        double areaSq=s.calculateArea(15, 0);
        double perimSq=s.calculatePerimeter(15,0);
        System.out.println("The area of given circe equals to "+areaCircle);
        System.out.println("The perimeter  of given circle is eguals to "+perimCircle);
        System.out.println("The area of given square equals to "+areaSq);
        System.out.println("The perimeter  of given square is eguals to "+perimSq);

    }
}
