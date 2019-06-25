
public class Pokemons {
	
	String name,ai,time,build;
	String id,chances,grass;
	boolean honey,fishing,notCatchable,cannotRun,announce,sr;
	
	public Pokemons(String id,String name,String ai,String time,String build,String chances,String grass,boolean honey,boolean fishing,boolean notCatchable,boolean cannotRun,boolean announce,boolean sr) {
		
		this.ai = ai;
		this.build = build;
		this.chances = chances;
		this.grass = grass;
		this.id = id;
		this.name = name;
		this.time = time;
		this.honey = honey;
		this.fishing = fishing;
		this.notCatchable = notCatchable;
		this.cannotRun = cannotRun;
		this.announce = announce;
		this.sr = sr;		
		
	}
	
	public String getPokemonId() 			{ return id; }
	public String getPokemonName()			{ return name;}
	public String getPokemonAi( ) 			{ return ai; }
	public String getPokemonTime() 			{ return time; }
	public String getPokemonBuild()			{ return build; }
	public String getPokemonChances()		{ return chances; }
	public String getPokemonGrass() 		{ return grass; }
	public boolean getPokemonHoney() 		{ return honey; }
	public boolean getPokemonFishing() 		{ return fishing; } 
	public boolean getPokemonNotCatchable() { return notCatchable; }
	public boolean getPokemonCannotRun()	{ return cannotRun; }
	public boolean getPokemonAnnounce() 	{ return announce ;}
	public boolean getPokemonSr() 			{ return sr; }
	
	

}
