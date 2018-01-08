package pokemon.model;

public class Suicune extends Pokemon implements WaterType
{

	public Suicune()
	{
		super(387, "Suicune");
		setup();
	}
	
	public Suicune(String name)
	{
		super(387, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAtttackPoints(234);
		this.setCanEvolve(false);
		this.setEnhancementModifiers(.89);
		this.setHealthPoints(123);
	}
	
	
	public Suicune(int number, String name)
	{
		super(number, name);
		
	}

	
	public String hydroCannon(int level)
	{
		String damage = "0";
		
		return damage;
	}


	public String surf(int level)
	{
		String damage = "0";
		
		return damage;
	}

	
	public String bubbleBeam(int level)
	{
		String damage = "0";
		
		return damage;
	}
	
	

	
}
