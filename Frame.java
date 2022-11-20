import java.awt.Component;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;

import javax.swing.JMenuBar;
import javax.swing.JPanel;

import javafx.scene.paint.Color;

public class Frame extends JFrame implements ActionListener {

	JButton home;
	JButton stock, orders, exit, suppliers, customers;

	public Frame() {

		home = new JButton("HOME");
		customers = new JButton("CUSTOMERS");
		suppliers = new JButton("SUPPLIERS");
		orders = new JButton("ORDERS");
		stock = new JButton("STOCK");
		exit = new JButton("EXIT");

		JMenuBar menuBar = new JMenuBar();
		menuBar.add(home);
		menuBar.add(customers);
		menuBar.add(suppliers);
		menuBar.add(stock);
		menuBar.add(orders);
		menuBar.add(exit);

		home.addActionListener(this);
		customers.addActionListener(this);
		suppliers.addActionListener(this);
		orders.addActionListener(this);
		stock.addActionListener(this);
		exit.addActionListener(this);

		JPanel pnl = new JPanel();

		this.setTitle("A Web Page");
		this.setVisible(true);
		this.setSize(600, 400);
		this.add(pnl);
		this.setJMenuBar(menuBar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == customers) {

			// this.dispose();
			NewFrame frame = new NewFrame();

		}

		if (e.getSource() == home) {

			NewFrame frame1 = new NewFrame();

		}

		if (e.getSource() == suppliers) {

			NewFrame frame2 = new NewFrame();

		}

		if (e.getSource() == stock) {

			NewFrame frame3 = new NewFrame();

		}
		if (e.getSource() == orders) {

			NewFrame frame4 = new NewFrame();

		}

		if (e.getSource() == exit) {

			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame f = new Frame();

	}

}
