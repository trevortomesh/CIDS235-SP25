public class Chicken extends Animal implements Edible{

    @Override
    public String howToEat(){
        return "Chicken: Fry it!";
    }

    @Override
    public String sound(){
        return "Chicken: cluck cluck cluck";
    }
}
