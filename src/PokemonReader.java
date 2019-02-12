

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.sql.rowset.spi.XmlReader;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.List;
import java.io.File;
import java.io.IOException;


public class PokemonReader {
	
	
	private static List<Pokemons> pokemon;
	
	private static List<Moves> move;
	
	private static List<caughtMoves> caughtMove;
	
	private static List<pokemonLevelStats> pokemonStat;
	
	private static 	SpawnToolGui g = new SpawnToolGui();

	
	private static DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
	
	
	public List<Pokemons> getPokemonList() throws SAXException, IOException {
		
		SpawnToolGui g = new SpawnToolGui();	
		
		
		try {
			DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(XmlReader.class.getResourceAsStream(g.getfileOpen()));
			document.normalize();
			
			NodeList rootNode = document.getElementsByTagName("pokemons");
			
			Node rootNod = rootNode.item(0);
						
			Element rootElement = (Element) rootNode;
			
			NodeList pokemonList = document.getElementsByTagName("pokemon");
			
			for(int i = 0 ; i<=pokemonList.getLength();i++) {
				
				Node thePokemon = pokemonList.item(i);
				
				Element pokemonElement = (Element) thePokemon;	
				
				
				
				pokemon.add(new Pokemons(
						pokemonElement.getAttribute("id"),
						pokemonElement.getAttribute("name"), 
						pokemonElement.getAttribute("ai"), 
						pokemonElement.getAttribute("time"), 
						pokemonElement.getAttribute("build"), 
						pokemonElement.getAttribute("chances"), 
						pokemonElement.getAttribute("grass")
						));
			}
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return pokemon;		
	}
	
	
	public List<Moves> getMovesList() throws ParserConfigurationException {
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		Document document;
		try {
			document = documentBuilder.parse(XmlReader.class.getResourceAsStream(g.getfileOpen()));
			document.normalize();
			
			NodeList rootNode = document.getElementsByTagName("pokemons");
			
			Element rootElement = (Element) rootNode;
			
			
			NodeList moveList = document.getElementsByTagName("moves");

			for(int i=0; i<=moveList.getLength();i++) {
				
				moveList = document.getElementsByTagName("moves").item(i).getChildNodes();
				
				for(int j=0; j<=moveList.getLength();j++) {
				
				Node theMove = moveList.item(i);
				
				Element moveElement = (Element) theMove;
				
				
				move.add(new Moves(moveElement.getAttribute("name")));
			
				}	
			}
			
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
		return move;		
	}	
	
//	public List<caughtMoves> getCaughtMovesList() throws ParserConfigurationException{
//		
//		
//		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
//		
//		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
//		Document document;
//		try {
//			document = documentBuilder.parse(XmlReader.class.getResourceAsStream(g.getfileOpen()));
//			document.normalize();
//			
//			NodeList rootNode = document.getElementsByTagName("pokemons");
//			
//			Element rootElement = (Element) rootNode;
//			
//			NodeList moveList = document.getElementsByTagName("caught-moves");
//			
//			for(int i=0; i<=moveList.getLength();i++) {
//				
//				Node theMove = moveList.item(i);
//				
//				Element moveElement = (Element) theMove;
//			
//				caughtMove.add(new caughtMoves(
//						moveElement.getAttribute("name"),
//						moveElement.getAttribute("drop"),
//						moveElement.getAttribute("level")
//						));
//			}
//			
//		} catch (SAXException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//	
//		return caughtMove;		
//		
//	}
	
	public List<pokemonLevelStats> getStatList() throws ParserConfigurationException{
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
		Document document;
		try {
			document = documentBuilder.parse(XmlReader.class.getResourceAsStream(g.getfileOpen()));
			document.normalize();
			
			NodeList rootNode = document.getElementsByTagName("pokemons");
			
			Element rootElement = (Element) rootNode;
			
			NodeList moveList = document.getElementsByTagName("stats");
			
			for(int i=0; i<=moveList.getLength();i++) {
				
				Node theMove = moveList.item(i);
				
				Element moveElement = (Element) theMove;
			
				pokemonStat.add(new pokemonLevelStats(
						moveElement.getAttribute("levelDown"),
						moveElement.getAttribute("levelUp")
						));
			}
			
		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	
		return pokemonStat;		
		
		
	}
}
