import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Main {
    public static void main(String[] args) {


    Tiger tony = new Tiger();
    Chicken jockey = new Chicken();
    Apple apple = new Apple();

    Object[] objects = {tony, jockey, apple};
        for (Object object : objects) {
            if (object instanceof Edible) {
                System.out.println(((Edible) object).howToEat());
            }

            if (object instanceof Animal) {
                System.out.println(((Animal) object).sound());
            }
        }


//        GregorianCalendar today = new GregorianCalendar();
//        System.out.println("Today's Date: ");
//        System.out.println("Year: " + today.get(Calendar.YEAR));
//        System.out.println("Month: " + (today.get(Calendar.MONTH) + 1));
//        System.out.println("Day: " + today.get(Calendar.DAY_OF_MONTH));



//      ArrayList<Number> list = new ArrayList<>();
//      list.add(45);
//      list.add(3445.53);
//
//      list.add(new BigInteger("3432323234344343101"));
//      list.add(new BigDecimal("2.0909090989091343344343"));
//
//      System.out.println("The largest number is " +
//              getLargestNumber(list));



/*        GeometricObject geoObject1 = new Circle(5, "blue", false);
        GeometricObject geoObject2 = new Rectangle(5, 3, "red",true);
        GeometricObject geoObject3 = new Circle(5, "red", true);
        System.out.println("Do the objects have the same area?" +
                equalArea(geoObject1, geoObject3));

        GeometricObject[] objects = new GeometricObject[10];
        objects[0] = new Circle();
*/
        //GeometricObject geodude = new GeometricObject();

//        Trainer trainer = new Trainer("BLUE");
//        trainer.setName("Slugzzz");
//        System.out.println("A wild Pokemon appeared!");
//        Pokemon newPokemon = new Pokemon("Pidgey", "Pidgey");
//        trainer.addPokemon(newPokemon);
//        System.out.println(newPokemon.getName() + " was caught!");
//        trainer.printTeam();
//
//        Pokemon pokemon2 = new Pokemon("Mew", "Mew");


//        Faculty trevor = new Faculty();
//        Course cids325 = new Course();
//        cids325.setFaculty(trevor);
//        System.out.println(cids325.getFaculty().toString());



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

    public static Number getLargestNumber(ArrayList<Number> list){
        if(list == null || list.size() == 0){
            return null;
        }
        Number number = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(number.doubleValue() < list.get(i).doubleValue()){
                number = list.get(i);
            }

        }
        return number;
    }


    public static boolean equalArea(GeometricObject object1, GeometricObject object2){
        return object1.getArea() == object2.getArea();
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