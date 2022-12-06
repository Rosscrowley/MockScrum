import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import java.awt.Color;
import java.awt.Component;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.*;

//HOME CLASS

public class home extends JFrame implements ActionListener {

	
	JButton view, exit, add, submitButton;
	JTextField nameText, dateText;
	JComboBox c1;
	JTextArea viewItems;
	ArrayList<Item> itemsList;

	public home() {

		JPanel panelAddItem = new JPanel();
		
		
		view = new JButton("VIEW ITEMS");
		exit = new JButton("EXIT");

		JMenuBar menuBar = new JMenuBar();
		
		JLabel nameLabel = new JLabel("Item Name");
		nameLabel.setBounds(10, 20, 80, 25);
		panelAddItem.add(nameLabel);
		
		nameText = new JTextField(20);
		nameText.setBounds(10, 10, 10, 10);
		panelAddItem.add(nameText);
		
		JLabel dateLabel = new JLabel("Expiry date");
		dateLabel.setBounds(10, 20, 80, 25);
		panelAddItem.add(dateLabel);
		
		dateText = new JTextField(20);
		dateText.setBounds(10, 10, 10, 10);
		panelAddItem.add(dateText);
				
	    c1 = new JComboBox();
	    c1.addItem("Essential");
	    c1.addItem("Luxury");
	    c1.addItem("Gift");
	    panelAddItem.add(c1);
	    
		submitButton = new JButton("Submit");
		//submitButton.addActionListener(this);
		submitButton.setBounds(10, 80, 80, 25);
		panelAddItem.add(submitButton);
		
		// ShowStudents text area displays the student array list
				viewItems = new JTextArea();
				viewItems.setEditable(true);
	    
		menuBar.add(view);
		menuBar.add(exit);
		
		JPanel panelItem = new JPanel();
		panelItem.setBorder(BorderFactory.createTitledBorder("NEW ITEM"));
		panelItem.add(panelAddItem, BorderLayout.SOUTH);
		panelItem.add(viewItems, BorderLayout.CENTER);
		//panelNewStudent.add(panelModules, BorderLayout.EAST);
		
		//add.addActionListener(this);
		view.addActionListener(this);
		exit.addActionListener(this);
		submitButton.addActionListener(this);
	
		
		
		this.setTitle("A Web Page");
		this.setVisible(true);
		this.setSize(600, 400);
		//pnl.setBackground(Color.cyan);
		this.add(panelItem);
		this.setJMenuBar(menuBar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == submitButton) { // when this button is pressed cutomers should be able to add something

			// this.dispose();
			//adding add = new adding();
			
			Item anItem;
			
			anItem = new Item(nameText.getText(), (String) c1.getSelectedItem(), dateText.getText());
			
			itemsList = new ArrayList<Item>();

			itemsList.add(anItem);
			
			for (Item s : itemsList) /** iterator */
			{
				//s.displayStudent();
			 viewItems.setText( s.displayItem() );

			}
			
			
		}		

		if (e.getSource() == view) { //// when this button is pressed cutomers should be able to view the products 

			//viewItems frame3 = new viewItems();
			
			
		}
		

		if (e.getSource() == exit) {

			Frame home = new Frame();

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	home f = new home();

	}
}
