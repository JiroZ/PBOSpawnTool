import java.awt.Container;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;
import javax.swing.ListModel;

public class PokemonListData {
	
	public ListModel<String> pokemonModel(){
		
		PokemonReader pokemonData = new PokemonReader();
		JList<String> list = new JList<String>();
		
		List<Pokemons> ListOfpokemons = pokemonData.getPokemonList();
		
		System.out.println("beforeloop");
		
		ListModel<String> names = null;
		for (Pokemons pokemon : ListOfpokemons) {

			((Container) names).add(pokemon.getPokemonName().toString(), list);
		}
		System.out.println("afterloop");
		
		return names;	
		
	}

}
