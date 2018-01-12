package pokemon.view;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import pokemon.controller.PokemonController;

public class PokedexPanel extends JPanel
{
	
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;

	
	
	
	
	
	public PokedexPanel(PokemonController appController)
	{
		super();
		this.appController = appController;
		
		appLayout = new SpringLayout();
		
		evolvableBox = new JCheckBox();
		nameField = new JTextField("name");
		numberField = new JTextField("##");
		attackField = new JTextField("ap");
		healthField = new JTextField("hp");
		modifierField = new JTextField("mod");
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png")), JLabel.CENTER);
		
		nameLabel = new JLabel("name");
		evolvableLabel = new JLabel("evolvable");
		numberLabel = new JLabel("number");
		attackLabel = new JLabel("attack");
		healthLabel = new JLabel("health");
		modifierLabel = new JLabel("modifier");
		pokedexDropdown = new JComboBox();
		clearButton = new JButton("clear");
		saveButton = new JButton("save");
		
		descriptionArea = new JTextArea(5, 10);
		typeArea = new JTextArea(4, 15);
		
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		
		
		setupPanel();
		setupLayout();
		setupComboBox();
	}
	
	
	private void setupPanel()
	{
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		this.add(iconLabel);
		this.add(nameLabel);
		this.add(evolvableLabel);
		this.add(numberLabel);
		this.add(attackLabel);
		this.add(healthLabel);
		this.add(modifierLabel);
		this.add(pokedexDropdown);
		this.add(clearButton);
		this.add(saveButton);
		this.add(descriptionArea);
		this.add(typeArea);
		this.add(firstType);
		this.add(secondType); 
		this.add(thirdType);
		this.add(fourthType);
		
		this.setLayout(appLayout);
		
		
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameField, -5, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, numberField, -5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.SOUTH, attackField, -5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, attackField);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierField, -5, SpringLayout.NORTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.WEST, evolvableBox, 10, SpringLayout.WEST, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthField, -5, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 250, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 10, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 30, SpringLayout.SOUTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 0, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 10, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 30, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 0, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 10, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 30, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 30, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 30, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 0, SpringLayout.NORTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 10, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 150, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -14, SpringLayout.WEST, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 10, SpringLayout.SOUTH, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, 5, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 10, SpringLayout.SOUTH, iconLabel);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, iconLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -10, SpringLayout.WEST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 26, SpringLayout.EAST, iconLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, -192, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, -25, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, 0, SpringLayout.SOUTH, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, firstType, 0, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, thirdType, 7, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 16, SpringLayout.EAST, descriptionArea);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, 0, SpringLayout.SOUTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 316, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, thirdType, -17, SpringLayout.WEST, secondType);
		appLayout.putConstraint(SpringLayout.EAST, fourthType, 0, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 6, SpringLayout.SOUTH, evolvableBox);
	}
	
	
	
	private void setupComboBox()
	{
		DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		pokedexDropdown.setModel(pokemonModel);
	}
	
	private void setupTypePanels()
	{
		firstType.setSize(50, 50);
		secondType.setSize(50, 50);
		thirdType.setSize(50, 50);
		fourthType.setSize(50, 50);
	}

}
