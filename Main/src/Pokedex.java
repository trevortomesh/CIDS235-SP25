import java.util.ArrayList;

public class Pokedex
{
    private ArrayList<Pokemon> entries;

    public Pokedex(){
        this.entries = new ArrayList<>();
    }

    public void addEntry(Pokemon p){
        entries.add(p);
    }


}
