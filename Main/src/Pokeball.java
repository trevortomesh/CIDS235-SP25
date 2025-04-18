public class Pokeball {
private Pokemon containedPokemon;

public Pokeball(String pokemonName, String species){
    this.containedPokemon = new Pokemon(pokemonName, species);
}

}
