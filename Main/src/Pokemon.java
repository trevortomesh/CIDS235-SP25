public class Pokemon {
    private String name;
    private String species;
    private Trainer trainer;

    public Pokemon(String name, String species){
        this.name = name;
        this.species = species;
    }

    public void setTrainer(Trainer trainer){
        this.trainer = trainer;
    }

    public String getName(){
        return this.name;
    }

    public String getSpecies(){
        return this.species;
    }

    public String getTrainerName(){
        return this.trainer.getName();
    }


}
