package pokemon.model;

public class Bulbasaur extends Pokemon implements GrassType
{

	public Bulbasaur()
	{
		super(387, "Bulbasaur");
		setup();
	}
	
	public Bulbasaur(String name)
	{
		super(387, name);
		setup();
	}
	
	
	public Bulbasaur(int number, String name)
	{
		super(number, name);
		setup();
		
	}
	
	protected void setup()
	{
		this.setAttackPoints(234);
		this.setCanEvolve(true);
		this.setEnhancementModifiers(.89);
		this.setHealthPoints(123);
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
