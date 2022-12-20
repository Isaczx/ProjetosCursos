package POO;

public class Visualização   {
	
	

	private Gafanhoto espectador;
	private Video filme;
	
	public Visualização(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.filme.setViews(this.filme.getViews() + 1);
		this.espectador.setTotAssistido(this.espectador.getTotAssistido()+1);
		
	}
	
	public Gafanhoto getEspectador() {
		return espectador;
	}
	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}
	public Video getFilme() {
		return filme;
	}
	public void setFilme(Video filme) {
		this.filme = filme;
	}
	
		
	
	
	
}
