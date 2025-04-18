import java.util.ArrayList;

public class Trainer {
    private String name;
    private ArrayList<Pokemon> team;
    public Trainer(String name){
        this.name = name;
        this.team = new ArrayList<>();
    }

    public void addPokemon(Pokemon p){
        team.add(p);
        p.setTrainer(this);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void printTeam(){
        for(Pokemon member : team) {
            System.out.println(member.getName());
        }
    }

}
