package Project2A;

public abstract class Marks {
    /*We have to calculate the average of marks obtained in three subjects by
student A and by student B. Create class 'Marks' with an abstract method
'getPercentage' that will return the average percentage of marks. Provide
implementation of abstract methods in classes 'A' and 'B'. The constructor of
student A takes the marks in three subjects as its parameters and the marks
in four subjects as its parameters for student B. Test your code
*/


    abstract double getPercentage();

}
class StudentA extends Marks{
    double history, literature, biology;
    public StudentA(double history, double literature, double biology){
        this.history=history;
        this.literature=literature;
        this.biology=biology;

    }

    @Override
 public double getPercentage() {
        return (history+literature+biology)/3;

    }
}
class StudentB extends Marks{
    double history, literature, biology, geography;
    public StudentB(double history, double literature, double biology, double geography){
        this.history=history;
        this.literature=literature;
        this.biology=biology;
        this.geography=geography;

    }

    @Override
   public double getPercentage() {
        return (history+literature+biology+geography)/4;


    }
}

class MarksTester{
    public static void main(String[] args) {
        Marks[] marksArr={new StudentA(100,100,100), new StudentB(10,10,10,10)};
        for (Marks a:marksArr){
            System.out.println("Your average score is " +a.getPercentage());
        }
    }
}
