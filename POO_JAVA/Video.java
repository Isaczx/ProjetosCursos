package POO;

public class Video implements AçoesVideo {
	
	private String titulo;
	private double avaliações;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.reproduzindo = false;
		this.views = 0;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getAvaliações() {
		return avaliações;
	}
	public void setAvaliações(double avaliações) {
		this.avaliações = avaliações;
	}
	public int getViews() {
		return views;
	}
	public int setViews(int views) {
		return this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean getReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	String videoD() {
		return "Video: " + titulo + " avaliações: " + avaliações + " views: " + views + " curtidas " + curtidas;

	}
	
	@Override
	public boolean play() {
		return this.reproduzindo = true;
		
	}
	@Override
	public boolean pause() {
		return this.reproduzindo = false;
		
	}
	@Override
	public int like() {
		return this.curtidas++;
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
