package pokemon.model;

public class Ivysaur extends Bulbasaur implements GrassType
{
	
	public Ivysaur()
	{
		super(387, "Ivysaur");
		setup();
	}
	
	public Ivysaur(String name)
	{
		super(387, name);
		setup();
	}
	
	
	public Ivysaur (int number, String name)
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

	
	

}
