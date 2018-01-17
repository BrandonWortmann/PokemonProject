package pokemon.controller;

import pokemon.model.*;
import pokemon.view.PokemonFrame;
import java.util.List;
import java.util.ArrayList;

public class PokemonController
{
	private List<Pokemon> pokedex;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokedex = new ArrayList<Pokemon>();
		pokedex.add(new Bulbasaur());
		pokedex.add(new Charmander());
		pokedex.add(new Ivysaur());
		pokedex.add(new Lotad());
		pokedex.add(new Squirtle());
		pokedex.add(new Suicune());
		appFrame = new PokemonFrame(this);
	}
	
	public List<Pokemon> getPokedex()
	{
		return pokedex;
	}
	
	public boolean isValidInteger(String input)
	{
		try
		{
			Integer.parseInt(input);
		}
		catch (NumberFormatException error)
		{
			return false;
		}
		
		return true;
	}
	
	public boolean isValidDouble(String input)
	{
		try
		{
			Double.parseDouble(input);
		}
		catch (NumberFormatException error)
		{
			return false;
		}
		
		return true;
	}
	
	public String[] convertPokedex()
	{
		String [] names = new String [pokedex.size()];
		
		for (int index = 0; index < pokedex.size(); index++)
		{
			names[index] = pokedex.get(index).getName();
		}
		
		return names;
	}
	
	public void updateSelected(int selection, int health, int attack, boolean evolve, double modify, String name)
	{
		Pokemon selected = pokedex.get(selection);
		
		selected.setAttackPoints(attack);
		selected.setCanEvolve(evolve);
		selected.setEnhancementModifiers(modify);
		selected.setName(name);
		selected.setHealthPoints(health);
		
		FileController.savePokemonToFile((ArrayList<Pokemon>) pokedex);
	}

	
}
