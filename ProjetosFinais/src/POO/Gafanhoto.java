package POO;

public class Gafanhoto extends Pessoa1 {
	
	

	private String login;
	private int totAssistido;
	
	public Gafanhoto(String nome, int idade, String sexo, int experiencia, String login) {
		super(nome, idade, sexo, experiencia);
		this.totAssistido = 0;
	}
	
	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	private int total() {
		return totAssistido;
		
	}
	
	private int viuMaisUm(int v) {
		return this.totAssistido++;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}
	
	
	
	
	
	
	

}
