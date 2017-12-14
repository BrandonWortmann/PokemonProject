package pokemon.model;

public abstract class Pokemon
{
	private int healthPoints;
	private int atttackPoints;
	private int number;
	private double enhancementModifiers;
	private String name;
	private boolean canEvolve;
	
	public Pokemon(int number, String name)
	{
		this.name = name;
		this.number = number;
	}
	
	public final String[] getPokemonTypes()
	{
		Class<?> [] types = getClass().getInterfaces();
		String [] pokeTypes = new String[types.length];
		
		for(int index = 0; index< types.length; index++)
		{
			String currentInterface = types[index].getCanonicalName();
			currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
			pokeTypes[index] = currentInterface;
		}
		
		return pokeTypes;
		
		
	}
	
	public String toString()
	{
		String description = "Hi, I am a " + name + ", and my HP is " + healthPoints;
		
		return description;
		
	}
	
	public String getPokemonInformation()
	{
		String pokemonInfo = "This pokemon is of type: " + this.getClass().getSimpleName();
		
		return pokemonInfo;
		
	}

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints()
	{
		return healthPoints;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints)
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @return the atttackPoints
	 */
	public int getAtttackPoints()
	{
		return atttackPoints;
	}

	/**
	 * @param atttackPoints the atttackPoints to set
	 */
	public void setAtttackPoints(int atttackPoints)
	{
		this.atttackPoints = atttackPoints;
	}

	/**
	 * @return the enhancementModifiers
	 */
	public double getEnhancementModifiers()
	{
		return enhancementModifiers;
	}

	/**
	 * @param enhancementModifiers the enhancementModifiers to set
	 */
	public void setEnhancementModifiers(double enhancementModifiers)
	{
		this.enhancementModifiers = enhancementModifiers;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve()
	{
		return canEvolve;
	}

	/**
	 * @param canEvolve the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}

	/**
	 * @return the number
	 */
	public int getNumber()
	{
		return number;
	}

}
