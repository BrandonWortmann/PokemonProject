package pokemon.model;

public class Squirtle extends Pokemon implements WaterType
{

	public Squirtle()
	{
		super(387, "Squirtle");
		setup();
	}
	
	public Squirtle(String name)
	{
		super(387, name);
		setup();
	}
	
	
	public Squirtle(int number, String name)
	{
		super(number, name);
		
	}
	
	protected void setup()
	{
		this.setAttackPoints(234);
		this.setCanEvolve(false);
		this.setEnhancementModifiers(.89);
		this.setHealthPoints(123);
	}

	
	public String hydroCannon(int level)
	{
		String damage ="0";
		
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
