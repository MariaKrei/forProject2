package Project2A;

public class Task6 {
    public void printVowels(String word){
        word=word.replaceAll("[^o,a,e,u,i]","");
        System.out.println(word.length());
    }

    public static void main(String[] args) {
        Task6 n=new Task6();
        n.printVowels("Documentation");
    }
}
