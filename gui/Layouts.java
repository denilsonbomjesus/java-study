package gui;

import java.awt.BorderLayout;
import java.awt.Container;
//import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//Layout define a disposicao dos controles no container e dos containers
public class Layouts extends JFrame {
	
	public Layouts() {
		super("Layouts");
		
		Container c = getContentPane();
		
		//BorderLayout -> informar a posicao que quero adicionar cada componente
		// NORTH, SOUTH, CENTER, EAST E WEST -> sao configuracoes do Layout padrao
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.EAST, new JButton("4"));
		c.add(BorderLayout.WEST, new JButton("5"));
		
		/*
		 * criando meu proprio Layout
		 * BorderLayout border = new BorderLayout();
		 * c.setLayout(border); //atribuir o Layout ao container
		 */
		
		
		/*
		 * usando FlowLayout() -> distribui pela ordem de chegada
		 * c.setLayout(new FlowLayout());
		 * c.add(new JButton("1"); 
		 * c.add(new JButton("2");
		 * c.add(new JButton("3"); ...
		*/
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Layouts();
	}

}
