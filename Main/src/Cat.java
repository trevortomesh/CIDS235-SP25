public class Cat {


    String name;
    int age;
    char sex;
    String color;
    String breed;
    double weight;

    Cat(){
        name = "Garfield";
        age = 10;
        sex = 'M';
        color = "orange";
        breed = "DSH";
        weight = 24;
    }

//        Cat(){
//            name = "Garfield";
//            age = 10;
//            sex = 'M';
//            color = "orange";
//            breed = "DSH";
//            weight = 24;
//        }

        Cat(String newName, int newAge, char newSex,
            String newColor, String newBreed, double newWeight){
            name = newName;
            age = newAge;
            sex = newSex;
            color = newColor;
            breed = newBreed;
            weight = newWeight;
        }

        public void meow(){
            System.out.println(name + " says meow!");
        }
    }




