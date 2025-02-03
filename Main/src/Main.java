public class Main {
    public static void main(String[] args) {
        String cat1Name = "Glitch";
        String cat2Name = "Haku";
        String cat3Name = "Genki";
        String cat4Name = "Soosoo";
        String cat5Name = "Tsuki";
        String cat6Name = "Wooper";

        String dog1Name = "Aria";

        char cat1Sex = 'M';
        char cat2Sex = 'M';
        char cat3Sex = 'M';
        char cat4Sex = 'F';
        char cat5Sex = 'M';
        char cat6Sex = 'M';

        char dog1Sex = 'F';

        String cat1Color = "Tuxedo";
        String cat2Color = "Tuxedo";
        String cat3Color = "Orange";
        String cat4Color = "Black";
        String cat5Color = "Black";
        String cat6Color = "Pink";

        String cat1Breed = "DSH";
        String cat2Breed = "DSH";
        String cat3Breed = "DLH";
        String cat4Breed = "DSH";
        String cat5Breed = "DSH";
        String cat6Breed = "Salamander";

        String dog1Breed = "Husky";

        String dog1Color = "Black and White";

        int cat1Age = 14;
        int cat2Age = 5;
        int cat3Age = 2;
        int cat4Age = 1;
        int cat5Age = 3;
        int cat6Age = 1;

        int dog1Age = 3;


        double cat1Weight = 12;
        double cat2Weight = 9;
        double cat3Weight = 12;
        double cat4Weight = 5;
        double cat5Weight = 5;
        double cat6Weight = 1;

        double dog1Weight = 35;

        giveMeds(cat1Name, cat1Age, cat1Weight);
        makeSound(dog1Name);

    }

    public static void giveMeds(String name, int age, double weight) {
        double dose = weight / (double) age;

        System.out.println("You should give " + name + " " + dose + " mg");
    }

    public static void makeSound(String catName){
        System.out.println(catName + " says MEOW!");
    }
}