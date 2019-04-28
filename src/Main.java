import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class Main  {
	
	static List<Moves> t;
	
	public static void main(String[] args) {			
		
		PokemonDatabaseReader db = new PokemonDatabaseReader();
		db.getPokemonMap();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpawnToolGui window = new SpawnToolGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();					
				}					
			}
		});		
	
}
}
