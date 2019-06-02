import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class PokemonDatabaseReader {
	
	public String cvsSplitBy = null;
	private String csvFile = ".\\src\\Assets\\data\\moveset.csv";
	public String line;
	public ArrayList<String> NameList = new ArrayList<String>();				
	public ArrayList<String> IDList = new ArrayList<String>();
	public HashMap<String, String> pokemonMap = new HashMap<String,String>();
	
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
	
	public ArrayList<String> getNameList() {
		return NameList;
	}
	public ArrayList<String> getIDList() {
		
		return IDList;
	}
	public HashMap<String, String> getPokemonMap() {
		this.PokemonNameID();
		System.out.println(pokemonMap.size());
		return this.pokemonMap;		
	}
	
	public void setPokemonMap(HashMap<String, String> pokemonMap) {
		this.pokemonMap = pokemonMap;
	}
	public void setNameList(ArrayList<String> nameList) {
		this.NameList = nameList;		
	}
	public void setIDList(ArrayList<String> iDList) {
		this.IDList = iDList;		
	}
	
}
