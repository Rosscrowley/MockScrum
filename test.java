import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class test extends JFrame implements ActionListener, ItemListener {


	JButton exit;

	// frame
    static JFrame test;

    // label
    static JLabel l, l1, l2;

    // combobox
    static JComboBox c1, c2;

    static JTextField tf;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	test = new JFrame("test");
	// create a new frame

    // create a object
    test s = new test();

    // array of string containing cities
    String s1[] = { "luxury", "Essential", "gift", " ", " " };
    String s2[] = { "january", "february", "march", "april", "may ", "june ", "july ", "august ", "september ", "october ", "november ", "december "};


    // create checkbox
    c1 = new JComboBox(s1);

    // create textfield
    tf = new JTextField(16);

    // create add and remove buttons
    JButton b = new JButton("ADD");
    JButton b1 = new JButton("REMOVE");

    // add action listener
    b.addActionListener(s);
    b1.addActionListener(s);

    // add ItemListener
    c1.addItemListener(s);

    // create labels
    l = new JLabel("options ");
    l1 = new JLabel(" selected");

    // set color of text
    l.setForeground(Color.black);
    l1.setForeground(Color.black);

    // create a new panel
    JPanel p = new JPanel();

    p.add(l);

    // add combobox to panel
    p.add(c1);

    p.add(l1);
    p.add(tf);
    p.add(b);
    p.add(b1);

    test.setLayout(new FlowLayout());

    // add panel to frame
    test.add(p);

    // set the size of frame
    test.setSize(700, 200);

    test.show();

	}


    // if button is pressed
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("ADD")) {
            c1.addItem(tf.getText());
        }
        else {
            c1.removeItem(tf.getText());
        }
    }

    public void itemStateChanged(ItemEvent e)
    {
        // if the state combobox is changed
        if (e.getSource() == c1) {

            l1.setText(c1.getSelectedItem() + " selected");

    		if (e.getSource() == exit) {

    			Frame home = new Frame();
        }
    }
}
}