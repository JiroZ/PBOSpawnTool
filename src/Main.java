import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.SortedMap;

import javax.xml.parsers.ParserConfigurationException;

public class Main  {
	
	static List<Moves> t;
	
	public static void main(String[] args) {
		
		PokemonReader data = new PokemonReader();
		List<pokemonLevelStats> list = data.getStatList();
		int i = 0 ;
		for(pokemonLevelStats statList : list) { 
			System.out.println(list);
			i++;
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SpawnToolGuiMain window = new SpawnToolGuiMain();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
}
}
