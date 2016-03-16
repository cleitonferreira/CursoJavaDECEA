package aula53;

//A classe produto é uma supeclasse 
public abstract class Produto {

	String descricao;
	
	//se vc é um produto, vc precisa implementar um método imprimirDescricao()
	public abstract void imprimirDescricao();
	
	public String getDescricao() {
		return descricao;
	}
}
