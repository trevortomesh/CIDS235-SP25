public class Mammal {
    String name;
    int age;
    char sex;
    String color;
    double weight;

    Mammal(String name, int age, char sex, String color, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.color = color;
    }

    Mammal(){
        this.name = "Steve";
        this.age = 100;
        this.weight = 50;
        this.sex = 'F';
        this.color = "Purple";

    }


}
