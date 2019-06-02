import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.DefaultListModel;

public class PokemonListData extends PokemonReader {
	
	
	private DefaultListModel namelistModel;
	
	private DefaultListModel chanceListModel;
	
	private DefaultListModel timeListModel;
	
	private DefaultListModel buildListModel;
	
	private DefaultListModel grassListModel;
	
	private DefaultListModel aiListModel;
	
	private DefaultListModel idListModel;
	
	public String name,chances,ID,time,build,grass,AI,iDs;
	
	
	public	List<Pokemons> pokemonsList = getPokemonList();	
	
	private int pokemonListSize = pokemonsList.size();
	
	
	public DefaultListModel pokemonNameModel(){
		
		namelistModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		name = getPokemonList().get(i).getPokemonName();	
		namelistModel.add(i, name);			
		}
		
		return namelistModel;			
	}
	
	public DefaultListModel pokemonChanceModel() {
		chanceListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		chances = getPokemonList().get(i).getPokemonChances();
		chanceListModel.add(i, chances);			
		}
		return chanceListModel;
	}
	
	public DefaultListModel pokemonTimeModel() {
		timeListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		time = getPokemonList().get(i).getPokemonTime();
		timeListModel.add(i, time);			
		}
		return timeListModel;
	}
	
	public DefaultListModel pokemonBuildModel() {
		buildListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		build = getPokemonList().get(i).getPokemonBuild();
		buildListModel.add(i, build);			
		}
		return buildListModel;
	}
	
	public DefaultListModel pokemonGrassModel() {
		grassListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		grass = getPokemonList().get(i).getPokemonGrass();
		grassListModel.add(i, grass);		
		}
		return grassListModel;
	}
	
	public DefaultListModel pokemonAIModel() {
		aiListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		AI = getPokemonList().get(i).getPokemonAi();
		aiListModel.add(i, AI);		
		}
		return aiListModel;
	}
	
	public DefaultListModel pokemonIDModel() {
		idListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		ID = getPokemonList().get(i).getPokemonId();
		idListModel.add(i, ID);		
		}
		return idListModel;
	}
	
	public DefaultListModel dbNameListModel() {
		
		DefaultListModel dbNameListModel = new DefaultListModel();
		
		PokemonDatabaseReader dbReader = new PokemonDatabaseReader();
		HashMap<String,String> pokemonMap = dbReader.getPokemonMap();
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
