public class Pokeball {
private Pokemon containedPokemon;

public Pokeball(String pokemonName, String species){
    this.containedPokemon = new Pokemon(pokemonName, species);
}

public Pokemon release(){
    Pokemon p = containedPokemon;
    containedPokemon = null; //Pokeball no longer contains it!
    return p;
}


}
