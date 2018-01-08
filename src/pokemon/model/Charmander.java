package pokemon.model;

public class Charmander extends Pokemon implements FireType
{
	
	public Charmander()
	{
		super(387, "Charmander");
		setup();
	}
	
	public Charmander(String name)
	{
		super(387, name);
		setup();
	}
	
	public Charmander(int number, String name)
	{
		super(number,name);
	}
	
	protected void setup()
	{
		this.setAtttackPoints(234);
		this.setCanEvolve(false);
		this.setEnhancementModifiers(.89);
		this.setHealthPoints(123);
	}

	
	
	public String fireBlast(int level)
	{
		String damage = "0";
		
		return damage;
	}
	
	public String flareBlitz(int level)
	{
		String damage = "0";
		
		return damage;
	}
	
	public String flamethrower(int level)
	{
		String damage = "0";
		
		return damage;
	}
	
	

}
