package aula43;

/*Criando javabeans
 * Para ser uma classe javabean - os atributos deveram ser declarados private*/
// get e set na classe PessoaBean


public class TesteJavaBean {

	public static void main(String[] args) {
		PessoaBean pessoa = new PessoaBean();
		
		//isso não vai compilar, pois os atributos estão privados
		//pessoa.nome = "Maria";
		
		pessoa.setNome("Maria");
		pessoa.setIdade(27);
		
		System.out.println(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos.");
	}
	
}
