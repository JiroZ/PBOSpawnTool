import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class PokemonDatabaseReader {
	
	public String cvsSplitBy = null;
	private String csvFile = ".\\src\\Assets\\data\\moveset.csv";
	private String itemFile = ".\\src\\Assets\\data\\items.csv";
	public String line;
	public ArrayList<String> NameList = new ArrayList<String>();				
	public ArrayList<String> IDList = new ArrayList<String>();
	public ArrayList<String> itemNameList = new ArrayList<String>();
	public ArrayList<String> itemIDList = new ArrayList<String>();
	public SortedMap<String, String> pokemonMap = new TreeMap<String,String>();
	public SortedMap<String, String> itemMap = new TreeMap<String,String>();
	
	
	void PokemonNameID() {		

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(csvFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		try {
			while ((line = br.readLine()) != null) {
			    
				// use comma as separator
			    String[] cols = line.split(",");
			  //  System.out.println("Coulmn 0= " + cols[0] + " , Column 1=" + cols[1]);
			    NameList.add(cols[0]);
			    IDList.add(cols[1]);
			//    System.out.println(cols[0]+" Added to the names List");
			    pokemonMap.put(cols[1], cols[0]);		    
			   
			    			    
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		setIDList(IDList);
		setNameList(NameList);
		setPokemonMap(pokemonMap);
		
		 // using keySet() for iteration over keys 
//        for (String id : pokemonMap.keySet())  
//            System.out.println("key: " + id); 
//          
//        // using values() for iteration over keys 
//        for (String name : pokemonMap.values())  
//            System.out.println("value: " + name); 		
		
	}
	
	void ItemDatabase() {
	
		try {
			BufferedReader br = new BufferedReader(new FileReader(itemFile));		
		
			while ((line = br.readLine()) != null) {			    
			
			    String[] cols = line.split(",");			
			    itemNameList.add(cols[0]);
			    itemIDList.add(cols[3]);				    
			    itemMap.put(cols[3], cols[0]);			    			    
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		
		setItemIDList(itemIDList);
		setItemNameList(itemNameList);
		setItemMap(itemMap);
	}
	
	
	public void setItemMap(SortedMap<String, String> itemMap) {
			this.itemMap = itemMap;
	}
	public void setItemNameList(ArrayList<String> itemNameList) {
			this.itemNameList = itemNameList;
	}
	public void setItemIDList(ArrayList<String> itemIDList) {
		this.itemIDList = itemIDList;
	}	
	public ArrayList<String> getItemNameList() {
		return itemNameList;
		}
	public ArrayList<String> getItemIDList() {
		return itemIDList;
		}
	public SortedMap<String,String> getItemMap() {
		this.ItemDatabase();
		return itemMap;
	}
	
	
	
	public ArrayList<String> getNameList() {
		return NameList;
	}
	public ArrayList<String> getIDList() {
		
		return IDList;
	}
	public SortedMap<String, String> getPokemonMap() {
		this.PokemonNameID();
		return this.pokemonMap;		
	}
	
	public void setPokemonMap(SortedMap<String, String> pokemonMap2) {
		this.pokemonMap = pokemonMap2;
	}
	public void setNameList(ArrayList<String> nameList) {
		this.NameList = nameList;		
	}
	public void setIDList(ArrayList<String> iDList) {
		this.IDList = iDList;		
	}
	
}
