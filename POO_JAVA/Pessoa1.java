package POO;

public abstract class  Pessoa1 {
	
	private String nome;
	private int idade;
	private String sexo;
	private int experiencia;
	
	
	
	public Pessoa1(String nome, int idade, String sexo, int experiencia) {		
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		
	}

	private String detalhes() {
		return "Nome: " + nome + " idade: " + idade + " sexo: " + sexo + " experiencia: " + experiencia;

	}
	
	private int ganharExp() {
		return this.experiencia++;
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
