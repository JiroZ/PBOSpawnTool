import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;

public class PokemonListData extends PokemonReader {
	
	
	private DefaultListModel<String> namelistModel;
	
	public String name;	
	public String ID;
	
	public	List<Pokemons> pokemonsList = getPokemonList();	
	
	private int pokemonListSize = pokemonsList.size();
	
	public DefaultListModel<String> pokemonNameModel(){	
		
		namelistModel = new DefaultListModel<String>();	
		
		for(int i = 0; i<=pokemonListSize-1; i++) {	
			
		name = getPokemonList().get(i).getPokemonName();	
		namelistModel.add(i, name);	

		System.out.println("Added to list:"+name);
		System.out.println(i);
		
		}
		return namelistModel;			
	}
	public DefaultListModel<String> dbNameListModel() {
		
		DefaultListModel<String> dbNameListModel = new DefaultListModel<String>();
		
		PokemonDatabaseReader dbReader = new PokemonDatabaseReader();
		Map<String,String> pokemonMap = dbReader.getPokemonMap();
		int count = 0;
		
		System.out.println(dbReader.getPokemonMap().size());
		
		for(Entry<String, String> Entries : pokemonMap.entrySet()) {
			name = Entries.getValue();
			ID = Entries.getKey();		
			System.out.println(name);
			dbNameListModel.add(count, ID + ":" + name);		
			
			count++;
		}
			
		return dbNameListModel;
		
	}

}
