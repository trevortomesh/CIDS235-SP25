import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


        Circle circlguy = new Circle(3.0, "green", true);
        Cat catGuy = new Cat();
        Loan loanGuy = new Loan();
        MyStack stackguy = new MyStack();
        Rectangle rectangleGuy = new Rectangle(10, 10);
        System.out.println(rectangleGuy.getDateCreated());
        System.out.println("The width of rectangleguy is " + rectangleGuy.getWidth());
        System.out.println(rectangleGuy);
//        System.out.println(stackguy.isEmpty());
//        System.out.println("size before pushing: " + stackguy.getSize());
//        stackguy.push(loanGuy);
//        stackguy.push(circlguy);
//        stackguy.push(catGuy);

//        System.out.println("size after pushing: " + stackguy.getSize());
//        System.out.println(stackguy.peek());
//        stackguy.pop();
//        System.out.println(stackguy.peek());
//        System.out.println(catGuy);
        System.out.println(catGuy);
        System.out.println(circlguy);
//        ArrayList<String> cityList= new ArrayList<>();
//        cityList.add("Stillwater");
//        cityList.add("Waunakee");
//        cityList.add("Cameron");
//        cityList.add("Somerset");
//        cityList.add("Hudson");
//        System.out.println(cityList);
//        System.out.println(cityList.size());
//        System.out.println(cityList.contains("Hudson"));
//        System.out.println(cityList.indexOf("Cameron"));
//        System.out.println(cityList.get(2));
//        cityList.remove("Stillwater");
//        System.out.println(cityList);


//        int a = 5;
//        Integer a1 = Integer.valueOf(a);
//        System.out.println(a1.floatValue());
//
//        //System.out.println(a.length());
//        int[] onedarray = {1,2,3};
//        Circle circly = new Circle(2.0);
//        Circle circleGuy = new Circle(73.23);
//        Cat myCat = new Cat("Glitch");
//        Cat myCat2 = new Cat("Haku");
//        Cat myCat3 = new Cat("Soosoo");
//        Cat myCat4 = new Cat("Genki");
//        Cat[] canadianCats = {myCat, myCat2};
//        Cat[] americanCats = {myCat3, myCat4};
//        Cat[][] trevorsCats = {canadianCats,americanCats};
//
//        Circle[] circleArray = {circly, circleGuy};
//
//        printCircleArray(circleArray);

//        for(int i = 0; i < circleArray.length; i++){
//            System.out.println("The area of a circle with " +
//                    "radius " + circleArray[i].getRadius() + " is " +
//                    circleArray[i].getArea());
//
//        }

//        String myString = new String("Hello World!");
//
//        String[] strArray = myString.split(" ");
//        System.out.println(strArray[1].charAt(0));


//        char[] charArray = {'G','o','o','d',' ','D','a','y','!'};
//        String message = new String(charArray);
//        System.out.println(message);
//        System.out.println(myString.toUpperCase());
//        System.out.println(myString);
//        char myChar = myString.charAt(6);
//        System.out.println(myChar);
//        System.out.println(myString.length());

//        int[] a = {1,2,3,4};
//        int[] b = {5,6,7,8};
//        int[][] twodarray = {a,b};
//        System.out.println(twodarray[1][1]);
//
//        String s = "Java";
//        System.out.println(s);
//       // s = new String("Python");
//        s = "Python";
//        System.out.println(s);

//        Loan loan = new Loan(5.0, 30, 100000);
//        System.out.println(loan.getMonthlyPayment());
 //       int i = (int) (Math.random() * 10);
//        System.out.println("Random number " + i);
//        Scanner input = new Scanner(System.in);
//        input.nextInt();

       // Circle myCircle = new Circle(5.0);
//        printCircle(myCircle);
//        //myCircle.radius = 5;
//        myCircle.setRadius(5);
//        System.out.println("myCircle radius is now " + myCircle.getRadius());
//        System.out.println(Circle.getNumberOfObjects());
//        System.out.println(myCircle.getArea());

//        int a = 7;
//        addTwo(a);
//        System.out.println(y);

//        Circle c1 = new Circle(5.0);
//        Circle c2 = new Circle(1);
//        Circle c3 = new Circle();
 //       Circle c4 = new Circle();
        //printCircle(c1);
        //System.out.println("c1 radius is now " + c1.getRadius());

        //Circle.numberOfObjects = 10;
        //myCircle.radius = 5;
//        System.out.println(Circle.getNumberOfObjects());
//        //System.out.println(Circle.getArea());
//
//        Circle circle1 = new Circle();
//        System.out.println(circle1.getNumberOfObjects());
//        Circle circle2 = new Circle(5);
//        System.out.println(circle2.getNumberOfObjects());
//        circle2.numberOfObjects = 0;
//        System.out.println(Circle.getNumberOfObjects());
//
//        circle2.setRadius(3);
//        System.out.println(circle1.radius);
//        System.out.println("------------");
//       // circle1.printStuff();
//        System.out.println("------------");

        //        int a = 5;
 //         int[] myArray = {1,2,3,4,5};
 //         System.out.println(myArray);
//        System.out.println(a);
//        Circle myCircle;
//        myCircle = new Circle();
//        System.out.println(myCircle);
//        System.out.println(myCircle.getArea());
//        Circle roundy = new Circle(2.0);
//        Circle rolly = new Circle();
//        Cat zoe = new Cat("Zoe", 8, 'F',
//                "Gray", "DSH",6);
//
//        Cat fatKitty = new Cat("Glitch", 14,
//                'M',"Tuxedo", "DSH",13);
//        zoe.meow();
//        fatKitty.meow();
//        System.out.println(roundy);
//        System.out.println(rolly);
//        //roundy.radius = 3;
//        rolly.setRadius(30);
//        System.out.println(roundy.radius);
//        System.out.println(rolly.radius);
//        System.out.println("Roundy has an area of " + roundy.getArea() +
//                " and Roundy is " + (zoe.age - roundy.radius) + " units " +
//                " smaller than Zoe's age! ");
//        System.out.println("Rolly has an area of " + rolly.getArea());
//        System.out.println("Roundy has a perimeter of " + roundy.getPerimeter());
//        System.out.println("Rolly has a perimeter of " + rolly.getPerimeter());


//       Cat glitch = new Cat();
//        System.out.println(glitch.name);
//        glitch.name = "Glitch";
//        glitch.age = 14;
//        glitch.sex = 'M';
//        glitch.weight = 13.0;
//        glitch.color = "Tuxedo";
//        glitch.breed = "DSH";
//        System.out.println("Cat name: " + glitch.name);
//        System.out.println("Cat age: " + glitch.age);
//        System.out.println("Cat weight: " + glitch.weight);
//        System.out.println("Cat color: " + glitch.color);
//        System.out.println("Cat breed: " + glitch.breed);
//        System.out.println("Cat sex: " + glitch.sex);
//
//        Cat haku = new Cat();
//        System.out.println(haku);
//        haku.name = "Haku";
//        haku.age = 5;
//        haku.sex = 'M';
//        haku.weight = 8.0;
//        haku.color = "Tuxedo";
//        haku.breed = "DSH";
//        System.out.println("Cat name: " + haku.name);
//        System.out.println("Cat age: " + haku.age);
//        System.out.println("Cat weight: " + haku.weight);
//        System.out.println("Cat color: " + haku.color);
//        System.out.println("Cat breed: " + haku.breed);
//        System.out.println("Cat sex: " + haku.sex);
//
//        String cat1Name = "Glitch";
//        String cat2Name = "Haku";
//        String cat3Name = "Genki";
//        String cat4Name = "Soosoo";
//        String cat5Name = "Tsuki";
//        String cat6Name = "Wooper";
//
//        String dog1Name = "Aria";
//
//        char cat1Sex = 'M';
//        char cat2Sex = 'M';
//        char cat3Sex = 'M';
//        char cat4Sex = 'F';
//        char cat5Sex = 'M';
//        char cat6Sex = 'M';
//
//        char dog1Sex = 'F';
//
//        String cat1Color = "Tuxedo";
//        String cat2Color = "Tuxedo";
//        String cat3Color = "Orange";
//        String cat4Color = "Black";
//        String cat5Color = "Black";
//        String cat6Color = "Pink";
//
//        String cat1Breed = "DSH";
//        String cat2Breed = "DSH";
//        String cat3Breed = "DLH";
//        String cat4Breed = "DSH";
//        String cat5Breed = "DSH";
//        String cat6Breed = "Salamander";
//
//        String dog1Breed = "Husky";
//
//        String dog1Color = "Black and White";
//
//        int cat1Age = 14;
//        int cat2Age = 5;
//        int cat3Age = 2;
//        int cat4Age = 1;
//        int cat5Age = 3;
//        int cat6Age = 1;
//
//        int dog1Age = 3;
//
//
//        double cat1Weight = 12;
//        double cat2Weight = 9;
//        double cat3Weight = 12;
//        double cat4Weight = 5;
//        double cat5Weight = 5;
//        double cat6Weight = 1;
//
//        double dog1Weight = 35;
//
//        //giveMeds(cat1Name, cat1Age, cat1Weight);
//        //makeSound(dog1Name);
//        addTwo();
//        addTwo(1,2);
//        addTwo(5);

    }

    public static void addTwo(){
        System.out.println("Must pass an argument!");
    }

    public static void addTwo(int x, int y){
        System.out.println(x + y);
    }

    public static void addTwo(int x){
        int y = 2;
        x = x + y;
        System.out.println(x);
        //System.out.println(a);
    }

    public static void printCircleArray(Circle[] circleArray){
        for(int i = 0; i < circleArray.length; i++){
            printCircle(circleArray[i]);
        }
    }
    public static void printCircle(Circle c){
        System.out.println("The area of the circle " + c +" of radius " +
                c.getRadius() + " is " + c.getArea());
    }

    public static void giveMeds(String name, int age, double weight) {
        double dose = weight / (double) age;

        System.out.println("You should give " + name + " " + dose + " mg");
    }

    public static void makeSound(String catName){
        System.out.println(catName + " says MEOW!");
    }
}