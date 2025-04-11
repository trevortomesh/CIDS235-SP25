import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        Circle object1 = new Circle(1, "Blue", true);
        Object object2 = new Rectangle(1,1);
        //Circle circle1 = new Object();

        displayObject(object1);
        displayObject(object2);

//        Faculty faculty = new Faculty();
//        System.out.println("(5) Do main stuff");
//       // Cat(String newName, int newAge, char newSex,
//        //String newColor, String newBreed, double newWeight)
//        Cat myCat = new Cat("Peter");
//        Whale myWhale = new Whale("Parker", 50, 'M',
//                "Grey", 50000);
//        printMammal(myWhale);
//        printMammal(myCat);
    }

    public static void displayObject(Object object) {

        if (object instanceof Circle) {
            System.out.println("The circle area is " +
                    ((Circle) object).getArea());
            System.out.println("The circle diameter is " +
                    ((Circle) object).getRadius() * 2);
        }
        else if (object instanceof Rectangle){
            System.out.println("The rectangle area is " +
                    ((Rectangle) object).getArea());
        }

        else {
            System.out.println(object.toString());
        }

//        System.out.println(object.toString());
//        System.out.println("Is the object a circle? " + (object instanceof Circle));

    }

    public static void printMammal(Mammal M){
        System.out.println("Mammal name: " + M.name +
                            " Mammal weight: " + M.weight+
                            " Mammal sex: " + M.sex +
                            " Mammal age: " + M.age +
                            " Mammal color: " + M.color);
//        M.meow();
//        System.out.println(M.breed);

    }

}