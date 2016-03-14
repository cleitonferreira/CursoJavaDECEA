package aula45.animal;

public class Cachorro {

	private String nome;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
//	método com acesso default
//	void sentar() {
//		System.out.println("Eu, " + nome + ", vou sentar!");
//	}
	
	public void sentar() {
		System.out.println("Eu, " + nome + ", vou sentar!");
	}
	
}
