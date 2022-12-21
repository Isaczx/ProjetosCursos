package Jogo1;

import javax.swing.JFrame;

public class Container extends JFrame {
	
		public Container () {
			
			add(new Primeira_Fase());
			setTitle("Jogo 1");
			setSize(1800,728);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);
			this.setResizable(true);
			setVisible(true);
			
		}
		
		public static void main(String[] args) {
			new Container();
		}

}
