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
		
		

		setupPanel();
		setupLayout();
		setupComboBox();
		setupTypePanels();
		setupListeners();
		updatePokedexInfo(pokedexDropdown.getSelectedIndex());
		updateImage();
		updateTypePanels();
		repaint();

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
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -14, SpringLayout.WEST, clearButton);
		appLayout.putConstraint(SpringLayout.EAST, clearButton, 0, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, clearButton, 10, SpringLayout.SOUTH, saveButton);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, 5, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, 0, SpringLayout.EAST, modifierField);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, evolvableBox);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 66, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, iconLabel, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, iconLabel, 69, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, -4, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, descriptionArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, descriptionArea, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, descriptionArea, -10, SpringLayout.WEST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.NORTH, typeArea, 81, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, typeArea, 0, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.NORTH, descriptionArea, 181, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 0, SpringLayout.NORTH, nameField);
		appLayout.putConstraint(SpringLayout.EAST, secondType, -20, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, firstType, 0, SpringLayout.SOUTH, nameField);
		appLayout.putConstraint(SpringLayout.WEST, typeArea, 0, SpringLayout.WEST, secondType);
		appLayout.putConstraint(SpringLayout.EAST, typeArea, 0, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.WEST, secondType, -60, SpringLayout.WEST, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, firstType, 0, SpringLayout.EAST, secondType);
		appLayout.putConstraint(SpringLayout.NORTH, secondType, 0, SpringLayout.NORTH, numberField);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, 0, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.WEST, firstType, 0, SpringLayout.WEST, secondType);
		
	}

	private void updatePokedexInfo(int index)
	{
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		typeArea.setText("");
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		for (int i = 0; i > types.length; i++)
		{
			typeArea.append(types[i] + "\n");
		}

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
	}

	private void updateTypePanels()
	{
		String[] types = appController.getPokedex().get(pokedexDropdown.getSelectedIndex()).getPokemonTypes();
		if (types[0].equals("FireType"))
		{
			firstType.setBackground(Color.RED);
		}
		else if (types[0].equals("GrassType"))
		{
			firstType.setBackground(Color.GREEN);
		}
		else if (types[0].equals("WaterType"))
		{
			firstType.setBackground(Color.BLUE);
		}
		else
		{
			firstType.setBackground(new Color(0, 0, 0, 0));
		}

		if (types.length == 2)
		{
			if (types[1].equals("FireType"))
			{
				secondType.setBackground(Color.RED);
			}
			else if (types[1].equals("GrassType"))
			{
				secondType.setBackground(Color.GREEN);
			}
			else if (types[1].equals("WaterType"))
			{
				secondType.setBackground(Color.BLUE);
			}
		}
		else
		{
			secondType.setBackground(new Color(0, 0, 0, 0));
		}

	}

	private void updateImage()
	{
		String path = "/pokemon/view/images/";
		String defaultName = "logo";
		String name = pokedexDropdown.getSelectedItem().toString();
		String extension = ".png";
		ImageIcon pokemonIcon;

		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name + extension));
		}
		catch (NullPointerException missingImageFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}

		iconLabel.setIcon(pokemonIcon);
	}

	private void setupListeners()
	{
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int selectedPokemonIndex = pokedexDropdown.getSelectedIndex();
				updatePokedexInfo(selectedPokemonIndex);
				updateImage();
				updateTypePanels();
				repaint();

			}

		});
	}

}
