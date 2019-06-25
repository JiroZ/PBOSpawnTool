import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;

import javax.swing.DefaultListModel;

public class PokemonListData extends PokemonReader {
	
	
	private DefaultListModel namelistModel;
	
	private DefaultListModel chanceListModel;
	
	private DefaultListModel timeListModel;
	
	private DefaultListModel buildListModel;
	
	private DefaultListModel grassListModel;
	
	private DefaultListModel aiListModel;
	
	private DefaultListModel idListModel;
	
	private DefaultListModel honeyListModel;
	
	private DefaultListModel fishingListModel;
	
	private DefaultListModel notCatchableListModel;
	
	private DefaultListModel cannotRunListModel;
	
	private DefaultListModel announceListModel;
	
	private DefaultListModel srListModel;
		
	public String name,chances,ID,time,build,grass,AI,iDs;

	boolean honey,fishing,notCatchable,cannotRun,announce,sr;	
	
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
	public DefaultListModel pokemonHoneyModel() {
		honeyListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		honey = getPokemonList().get(i).getPokemonHoney();
		honeyListModel.add(i, honey);		
		}
		
		return honeyListModel;
	}
	
	public DefaultListModel pokemonFishingModel() {
		fishingListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		fishing = getPokemonList().get(i).getPokemonFishing();
		fishingListModel.add(i, fishing);		
		}
		
		return fishingListModel;
	}
	
	public DefaultListModel pokemonNotCatchableModel() {
		notCatchableListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		notCatchable = getPokemonList().get(i).getPokemonNotCatchable();
		notCatchableListModel.add(i, notCatchable);		
		}		
		return notCatchableListModel;
	}
	public DefaultListModel pokemonCannotRunModel() {
		cannotRunListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		cannotRun = getPokemonList().get(i).getPokemonCannotRun();
		cannotRunListModel.add(i, cannotRun);		
		}		
		return cannotRunListModel;
	}	
	public DefaultListModel pokemonAnnounceModel( ) {
		announceListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
			announce = getPokemonList().get(i).getPokemonAnnounce();
			announceListModel.add(i, sr);		
			}		
			return announceListModel;
		
	}
	public DefaultListModel pokemonSRAnnounceModel() {
		srListModel = new DefaultListModel();
		for(int i = 0; i<=pokemonListSize-1; i++) {				
		sr = getPokemonList().get(i).getPokemonSr();
		srListModel.add(i, sr);		
		}		
		return srListModel;
	}
	
	public DefaultListModel dbNameListModel() {
		
		DefaultListModel dbNameListModel = new DefaultListModel();
		
		PokemonDatabaseReader dbReader = new PokemonDatabaseReader();
		SortedMap<String,String> pokemonMap = dbReader.getPokemonMap();
		int count = 0;
		
		System.out.println(dbReader.getPokemonMap().size());
		
		for(Entry<String, String> Entries : pokemonMap.entrySet()) {
			name = Entries.getValue();
			ID = Entries.getKey();		
			//System.out.println(name);
			dbNameListModel.add(count, ID + ":" + name);		
			
			count++;
		}
			
		return dbNameListModel;
		
	}

}
