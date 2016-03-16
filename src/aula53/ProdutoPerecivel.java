package aula53;

public class ProdutoPerecivel extends Produto {

	String dataValidade; //Por enquanto, não aprendemos a classe Date
	
	public void imprimirDescricao() {
		//Digitar a lógica...
		System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
	}

}
