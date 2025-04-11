public class Whale extends Mammal{
    Whale(String name, int age, char sex, String color, double weight) {
        super(name, age, sex, color, weight);
    }

    public void doWhaleThings(){
        System.out.println("Does whale stuff!");
    }
}
