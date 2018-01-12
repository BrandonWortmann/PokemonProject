package pokemon.model;

public class Lotad extends Pokemon implements GrassType, WaterType
{

	public Lotad()
	{
		super(387, "Lotad");
		setup();
	}
	
	public Lotad(String name)
	{
		super(387, name);
		setup();
	}
	
	public Lotad(int number, String name)
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

	
	public String leafBlade(int level)
	{
		String damage = "0";
		
		return damage;
	}

	
	public String razorLeaf(int level)
	{
		String damage = "0";
		
		return damage;	
	}

	
	public String seedBomb(int level)
	{
		String damage = "0";
		
		return damage;	
	}
	
	

	
}
