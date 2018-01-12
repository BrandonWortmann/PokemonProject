package pokemon.model;

import java.util.ArrayList;

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
		Class<?> currentClass = this.getClass();
		String [] types = null;
		ArrayList<String> parentType = new ArrayList<String>();
		
		while(currentClass.getSuperclass() !=null)
		{
			Class<?> [] pokemonTypes = currentClass.getInterfaces();
			types = new String[pokemonTypes.length];
			
		
		
			for(int index = 0; index< pokemonTypes.length; index++)
			{
				String currentInterface = pokemonTypes[index].getCanonicalName();
				currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".", "");
				if(!parentType.contains(currentInterface))
				{
					parentType.add(currentInterface);
				}
				
			}
			
			currentClass = currentClass.getSuperclass();
		}
		
		types = new String [parentType.size()];
		
		for(int index = 0; index < parentType.size(); index++)
		{
			types[index] = parentType.get(index);
		}
		
		return types;
		
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
