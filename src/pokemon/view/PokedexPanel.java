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
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -10, SpringLayout.EAST, this);
		numberField = new JTextField("##");
		appLayout.putConstraint(SpringLayout.NORTH, numberField, 25, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, nameField);
		attackField = new JTextField("ap");
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 25, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, attackField, 0, SpringLayout.EAST, nameField);
		healthField = new JTextField("hp");
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 25, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 0, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, attackField);
		modifierField = new JTextField("mod");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableBox, 25, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 25, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, 0, SpringLayout.EAST, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, modifierField, 0, SpringLayout.EAST, healthField);
		
		iconLabel = new JLabel("", new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png")), JLabel.CENTER);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 5, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 10, SpringLayout.WEST, this);
		
		nameLabel = new JLabel("name");
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 250, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, 0, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 10, SpringLayout.EAST, nameLabel);
		evolvableLabel = new JLabel("evolvable");
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 0, SpringLayout.NORTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableLabel, 0, SpringLayout.SOUTH, evolvableBox);
		appLayout.putConstraint(SpringLayout.EAST, evolvableLabel, -10, SpringLayout.WEST, evolvableBox);
		numberLabel = new JLabel("number");
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, numberLabel, 0, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 10, SpringLayout.EAST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, nameLabel);
		attackLabel = new JLabel("attack");
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 0, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.SOUTH, attackLabel, 0, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 10, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, nameLabel);
		healthLabel = new JLabel("health");
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 0, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.SOUTH, healthLabel, 0, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, nameLabel);
		modifierLabel = new JLabel("modifier");
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 0, SpringLayout.NORTH, modifierField);
		appLayout.putConstraint(SpringLayout.SOUTH, modifierLabel, 0, SpringLayout.SOUTH, modifierField);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 10, SpringLayout.EAST, modifierLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, nameLabel);
		pokedexDropdown = new JComboBox();
		appLayout.putConstraint(SpringLayout.WEST, pokedexDropdown, 0, SpringLayout.WEST, nameLabel);
		clearButton = new JButton("clear");
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 0, SpringLayout.NORTH, numberField);
		saveButton = new JButton("save");
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 31, SpringLayout.EAST, iconLabel);
		
		descriptionArea = new JTextArea(5, 10);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 0, SpringLayout.WEST, iconLabel);
		typeArea = new JTextArea(4, 15);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, -4, SpringLayout.NORTH, typeArea);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 22, SpringLayout.SOUTH, descriptionArea);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 0, SpringLayout.WEST, iconLabel);
		
		firstType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 0, SpringLayout.NORTH, attackField);
		thirdType = new JPanel();
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, -61, SpringLayout.NORTH, typeArea);
		fourthType = new JPanel();
		appLayout.putConstraint(SpringLayout.NORTH, fourthType, 30, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 0, SpringLayout.WEST, firstType);
		
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
		this.add(thirdType);
		this.add(fourthType);
		
		this.setLayout(appLayout);
		secondType = new JPanel();
		appLayout.putConstraint(SpringLayout.EAST, thirdType, 0, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 7, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 0, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 35, SpringLayout.EAST, iconLabel);
		add(secondType);
		
	}
	
	private void setupLayout()
	{
		
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
