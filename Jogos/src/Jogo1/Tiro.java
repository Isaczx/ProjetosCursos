package Jogo1;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tiro {
	
	private Image imagem;
	private int x,y;
	private int largura,altura;
	private boolean insVisivel;
	
	private static final int LARGURA = 938;
	private static int VELOCIDADE = 2;
	
	public Tiro(int x, int y) {
		this.x = x;
		this.y=y;
		insVisivel = true;
		
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("res1/Laser do Jogador.png");
		imagem = referencia.getImage();
		
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
	}
	
	public void update() {
		this.x += VELOCIDADE;
		if(this.x >= LARGURA) {
			insVisivel = false;
		}
	}

	public boolean isInsVisivel() {
		return insVisivel;
	}

	public void setInsVisivel(boolean insVisivel) {
		this.insVisivel = insVisivel;
	}

	public static int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public static void setVELOCIDADE(int vELOCIDADE) {
		VELOCIDADE = vELOCIDADE;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
}
