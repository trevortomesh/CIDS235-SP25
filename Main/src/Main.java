import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Faculty faculty = new Faculty();
        System.out.println("(5) Do main stuff");
       // Cat(String newName, int newAge, char newSex,
        //String newColor, String newBreed, double newWeight)
        Cat myCat = new Cat("Peter");
        printMammal(myCat);
    }

    public static void printMammal(Mammal M){
        System.out.println("Mammal name: " + M.name +
                            " Mammal weight: " + M.weight+
                            " Mammal sex: " + M.sex +
                            " Mammal age: " + M.age +
                            " Mammal color: " + M.color);
        M.meow();

    }

}