
public class Pokemons {
	
	String name,ai,time,build;
	String id,chances,grass;
	
	public Pokemons(String id,String name,String ai,String time,String build,String chances,String grass) {
		
		this.ai = ai;
		this.build = build;
		this.chances = chances;
		this.grass = grass;
		this.id = id;
		this.name = name;
		this.time = time;
		
	}
	
	public String getPokemonId() 		{ return id; }
	public String getPokemonName()		 { return name;}
	public String getPokemonAi( ) 		{ return ai; }
	public String getPokemonTime() 		{ return time; }
	public String getPokemonBuild()	 { return build; }
	public String getPokemonChances() {return chances; }
	public String getPokemonGrass() 	{ return grass; }
	
	

}
