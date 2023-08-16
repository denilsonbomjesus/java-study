package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//unir BorderLayout e GridLayout
public class Layouts3 extends JFrame {
	
	public Layouts3() {
		super("Layouts3");
		
		//conatiner principal
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		//segundo container -> dentro do principal
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("Ok"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup..."));
		c2.add(new JButton("Help"));
		
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts3();

	}

}
