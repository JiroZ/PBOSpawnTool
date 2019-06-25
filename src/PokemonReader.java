
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.io.File;
import java.io.IOException;

public class PokemonReader {

	private static ArrayList<Pokemons> ListOfpokemons = new ArrayList();

	private static List<Moves> move;

	private static List<caughtMoves> caughtMove;

	private static List<pokemonLevelStats> pokemonStat;

	private static SpawnToolGuiMain g = new SpawnToolGuiMain();
	
	
	
	private static DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
	 
	public static File InputFile = null;
	

	public List<Pokemons> getPokemonList() {

		try {			
			InputFile = new File(g.getfileOpenLocation());
			//InputFile = new File("D:\\projects\\PBOSpawnTool\\src\\Assets\\data\\spawnFiles\\12.spawn");
			setInputFile(InputFile);
			
			DocumentBuilder documentBuilder;
			documentBuilder = builderFactory.newDocumentBuilder();

			Document document;			
				document = documentBuilder.parse(InputFile);

				document.normalize();

				NodeList rootNodeList = document.getElementsByTagName("pokemons");

				Node rootNode = rootNodeList.item(0);

				Element rootElement = (Element) rootNode;

				NodeList pokemonList = document.getElementsByTagName("pokemon");
				

				for (int i = 0; i <= pokemonList.getLength() - 1; i++) {

					Node thePokemon = pokemonList.item(i);

					Element pokemonElement = (Element) thePokemon;
					

					Element pokemon = (Element) pokemonList.item(i);

				 	boolean honey = pokemon.hasAttribute("honey");
	                boolean fish = pokemon.hasAttribute("fishing");
	                boolean notCatchable = pokemon.hasAttribute("notCatchable");
	                boolean cannotRun = pokemon.hasAttribute("cannotRun");
	                boolean announce = pokemon.hasAttribute("announce");
	                boolean srAnnounce = pokemon.hasAttribute("sr");

					
					// System.out.println(pokemonElement.getAttribute("id"));
					
					 

					ListOfpokemons.add(new Pokemons(
							pokemonElement.getAttribute("id"),
							pokemonElement.getAttribute("name"), 
							pokemonElement.getAttribute("ai"),
							pokemonElement.getAttribute("time"),
							pokemonElement.getAttribute("build"),
							pokemonElement.getAttribute("chances"), 
							pokemonElement.getAttribute("grass"),
							honey,
							fish,
							notCatchable,
							cannotRun,
							announce,
							srAnnounce));
					
				//	System.out.println(ListOfpokemons.get(i).getPokemonName());

				}

			} catch (Exception e) {
				e.printStackTrace();}			
		
		return ListOfpokemons;
	}
	
	
	
	public List<pokemonLevelStats> getStatList() {
		 
		 
		  try {
			  
			  InputFile = this.GetInputfile();
			  	DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			  	DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();		
				  Document document = documentBuilder.parse(InputFile);
				  document.normalize();
		  
				  NodeList pokemonsList = document.getElementsByTagName("pokemons");
				  
				  Node pokemonsNode = pokemonsList.item(0);
				  
				  NodeList pokemonList = document.getElementsByTagName("pokemon");
				  
				  Node pokemonNode = pokemonList.item(0);			  				  
		  
				  NodeList statList = document.getElementsByTagName("stats");	  
				  
				 
				  
				  for(int i=0; i<=pokemonList.getLength();i++) {					 				  
					  
					  Node theStat = statList.item(i);
		 
					  Element levelElement = (Element) theStat;
					  
					 System.out.println(levelElement.getAttribute("levelUp"));
					  
					  pokemonStat.add(new pokemonLevelStats( 
							  levelElement.getAttribute("levelDown"),
							  levelElement.getAttribute("levelUp")
							  ));
				  		}			  
		  		} catch(Exception e) {
			e.printStackTrace();}
		  
		  return pokemonStat; 
			
	}

	public SortedMap<String, String> getMovesList() {	
		
		
		SortedMap<String,String> MovesMap = new TreeMap<String,String>();
		
		
		 try {
			  
			 InputFile = this.GetInputfile();
			  	DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			  	DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();		
				  Document document = documentBuilder.parse(InputFile);
				  document.normalize();
				  
				  NodeList pokemonsList = document.getElementsByTagName("pokemons");
				  
				  Node pokemonsNode = pokemonsList.item(0);
				  
				  NodeList pokemonList = document.getElementsByTagName("pokemon");
				  
				  Node pokemonNode = pokemonList.item(0);	
				  
				  NodeList movesList = document.getElementsByTagName("moves");		

				  
				  
				  for(int i=0; i<pokemonList.getLength();i++) {
					  
					  Element pokemon = (Element) pokemonList.item(i);
					  
					  NodeList theMoves = ((Element) pokemon.getElementsByTagName("moves").item(0)).getElementsByTagName("move");
					  
					
					  
					  for(int j=0 ; j<theMoves.getLength();j++) {
					 						  
						  Node theMove = theMoves.item(j);
						  Element moveElement = ((Element) theMove);
						  
						  
						  
						  String pokemonNumber = Integer.toString(i);
						  String moveNumber = Integer.toString(j);
						  String moveValue = moveElement.getAttribute("name");
						  String key = moveNumber+pokemonNumber;
						  
						  System.out.println(key +" "+ moveValue);										
						  
						  MovesMap.put(key,moveValue);	
						
					  } 						  
				  }		  
				  
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return MovesMap;		
	}
	
	
	public SortedMap<String, SortedMap<String,String>> getCaughtMovesList() {
			
		SortedMap<String, String> caughtMoveElements = new TreeMap<String,String>() ;
		SortedMap<String, SortedMap<String, String>> caughtMovesMap = new TreeMap<String, SortedMap<String,String>>() ;
		
		 try {
			  
			 InputFile = this.GetInputfile();
			  	DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			  	DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();		
				  Document document = documentBuilder.parse(InputFile);
				  document.normalize();
				  
				  NodeList pokemonsList = document.getElementsByTagName("pokemons");
				  
				  Node pokemonsNode = pokemonsList.item(0);
				  
				  NodeList pokemonList = document.getElementsByTagName("pokemon");
				  
				  Node pokemonNode = pokemonList.item(0);	
				  
				  NodeList movesList = document.getElementsByTagName("caught-moves");	
				  
				  
				  for(int i=0; i<pokemonList.getLength();i++) {
					  
					  Element pokemon = (Element) pokemonList.item(i);
					  
					  NodeList theMoves = ((Element) pokemon.getElementsByTagName("caught-moves").item(0)).getElementsByTagName("move");
					  
					  for(int j=0 ; j<theMoves.getLength();j++) {
 						  
						  Node theMove = theMoves.item(j);
						  Element moveElement = ((Element) theMove);
						  
						  
						  
						  String pokemonNumber = Integer.toString(i);
						  String moveNumber = Integer.toString(j);
						  String key = moveNumber+pokemonNumber;
						  
						  caughtMoveElements.put(moveElement.getAttribute("name"), moveElement.getAttribute("level")); 
						
						//  System.out.println(key +" "+ moveValue);										
						  
						  caughtMovesMap.put(key,caughtMoveElements);	
						
					  } 						  
				  
				  }
				  
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		return caughtMovesMap;
	}
	
	
	
	
	public void setInputFile(File InputFile) {
		PokemonReader.InputFile = InputFile;		
	}	
	
	public File GetInputfile() {
		return PokemonReader.InputFile;		
	}	 
}