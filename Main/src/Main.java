import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        Faculty trevor = new Faculty();
        Course cids325 = new Course();
        cids325.setFaculty(trevor);
        System.out.println(cids325.getFaculty().toString());



//        int age = 45;
//        byte newAge = (byte) age; // a new value is assigned
//        System.out.println(newAge);
//
// //       Object r = new Rectangle();
//        Object o = new Circle();
//        //System.out.println(o);
//        Circle c = (Circle) o;
//        //System.out.println(c);
//
//        System.out.println(c.equals(o));
/*
        public boolean equals(Object obj){
            return this == obj;
        }
 */

//        Circle c2 = (Circle) r;

//        Circle object1 = new Circle(1, "Blue", true);
//        Object object2 = new Rectangle(1,1);
//        //Circle circle1 = new Object();
//        Cat cat1 = new Cat();
//
//        displayObject(object1);
//        displayObject(object2);
//        displayObject(cat1);

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
//       M.meow();
//        System.out.println(M.breed);

    }

}