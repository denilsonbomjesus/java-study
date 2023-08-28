package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{

	JTextField entrada;
	JButton b0;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton ponto;
	JButton igual;
	JButton soma;
	JButton subtracao;
	JButton divisao;
	JButton multiplicacao;

	public Calculadora() {
		super("Calculadora");
		
		entrada = new JTextField();
		entrada.setFont(new Font("serif", Font.PLAIN, 26));
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		ponto = new JButton(".");
		igual = new JButton("=");
		soma = new JButton("+");
		subtracao = new JButton("-");
		divisao = new JButton("/");
		multiplicacao = new JButton("*");
		
		Container c = new JPanel();
		c.setLayout(new GridLayout(4,4,5,5));
		// primeira linha
		c.add(b7);
		c.add(b8);
		c.add(b9);
		c.add(divisao);
		// segunda linha
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(multiplicacao);
		// terceira linha
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(subtracao);
		// quarta linha
		c.add(b0);
		c.add(ponto);
		c.add(igual);
		c.add(soma);
		
		Container c0 = getContentPane();
		c0.setLayout(new BorderLayout());
		c0.add(BorderLayout.NORTH, entrada);
		c0.add(BorderLayout.CENTER, c);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Calculadora();
	}

}
