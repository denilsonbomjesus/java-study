package gui;

import javax.swing.JFrame;
import javax.swing.JButton;

//hierarquia: janela -> container -> componentes (controles)

/*
 * essa classe Janela() representa a própria Janela (frame) 
 * logo posso fazer "extends JFrame" e nao precisaria nomear 
 * o JFrame de "frame"
*/
public class Janela {
	
	//metodo constructor da Classe Janela
	public Janela() {
		
		//inicializar uma janela com JFrame
		JFrame frame = new JFrame();
		frame.setTitle("Minha Janela");
		
		//componentes
		JButton botao = new JButton("Clique"); // butao
		
		//recuperar o container da janela
		frame.getContentPane().add(botao);
		
		//evento padrao para quando o usuario fechar a janela
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//atributos da janela
		frame.setSize(300,300); // tamanho
		frame.setVisible(true); // visibilidade
	}

	public static void main(String[] args) {

		//chamando o metodo janela
		new Janela();
	}

}
