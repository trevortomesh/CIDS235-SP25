public class Cat extends Mammal{
    String name;
    String breed;

    Cat(){
    }

        Cat(String name, int age, char sex,
            String color, String breed, double weight){
            super(name, age, sex, color, weight);
           this.breed = breed;
        }

    public Cat(String name) {
        super(name, 5, 'M', "Black",12);

    }

    public void meow(){
            System.out.println(name + " says meow!");
        }
    }




