
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

					
					// System.out.println(pokemonElement.getAttribute("id"));
					
					 

					ListOfpokemons.add(new Pokemons(
							pokemonElement.getAttribute("id"),
							pokemonElement.getAttribute("name"), 
							pokemonElement.getAttribute("ai"),
							pokemonElement.getAttribute("time"),
							pokemonElement.getAttribute("build"),
							pokemonElement.getAttribute("chances"), 
							pokemonElement.getAttribute("grass")));
					
				//	System.out.println(ListOfpokemons.get(i).getPokemonName());

				}

			} catch (Exception e) {
				e.printStackTrace();}
				
		
				
		
		return ListOfpokemons;
	}
	
	public List<pokemonLevelStats> getStatList() {
		 
		 
		  try {
			  	DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			  	DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();		
				  Document document = documentBuilder.parse(this.GetInputfile());
				  document.normalize();
		  
				  NodeList rootNode = document.getElementsByTagName("pokemons");
		  
				  Element rootElement = (Element) rootNode;
		  
				  NodeList statList = document.getElementsByTagName("stats");
		  
				  for(int i=0; i<=statList.getLength();i++) {
		 
					  Node theStat = statList.item(i);
		 
					  Element levelElement = (Element) theStat;
		  
					  pokemonStat.add(new pokemonLevelStats( 
							  levelElement.getAttribute("levelDown"),
							  levelElement.getAttribute("levelUp")
							  ));
				  		}			  
		  		} catch(Exception e) {
			e.printStackTrace();}
		  
		  return pokemonStat; 
			
	}



	public void setInputFile(File InputFile) {
		PokemonReader.InputFile = InputFile;		
	}	
	
	public File GetInputfile() {
		return PokemonReader.InputFile;		
	}	 
}