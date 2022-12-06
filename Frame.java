

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


public class Frame extends JFrame implements ActionListener {

	JButton home;
	JButton stock, exit, suppliers, admin;

	public Frame() {

		home = new JButton("HOMdryjue57jE");
		admin = new JButton("Admin page");
		suppliers = new JButton("SUPPLIERS");
		

		JMenuBar menuBar = new JMenuBar();
		menuBar.add(home);
		menuBar.add(admin);
		menuBar.add(suppliers);
		

		home.addActionListener(this);
		admin.addActionListener(this);
		suppliers.addActionListener(this);
	

		JPanel pnl = new JPanel();
		pnl.add(menuBar);
		pnl.setVisible(true);
		
		this.setTitle("A Web Page");
		this.setVisible(true);
		this.setSize(600, 400);
		this.add(pnl);
		this.setJMenuBar(menuBar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == admin) {

	     //ItemFrame itemFrame = new ItemFrame();
	      home h = new home();

		}

		if (e.getSource() == home) {

			

		}

		if (e.getSource() == suppliers) {

			//NewFrame frame2 = new NewFrame();

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
