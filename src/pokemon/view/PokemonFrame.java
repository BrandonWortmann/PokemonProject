package pokemon.view;

import pokemon.controller.PokemonController;
import javax.swing.JFrame;

public class PokemonFrame extends JFrame
{
	private PokemonController appController;
	private PokedexPanel appPanel;
	
	public PokemonFrame(PokemonController appController)
	{
		super();
		this.appController = appController;
		appPanel = new PokedexPanel(appController);
		setupFrame();
		
	}
	
	private void setupFrame()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(appPanel);
		this.setTitle("Pokemon");
		this.setSize(500, 324);
		this.setVisible(true);
		
	}

}
