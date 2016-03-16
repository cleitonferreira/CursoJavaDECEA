package aula53;

/*
 * Classes abstratas
 * */

public class TesteClasseAbstrata {

	public static void main(String[] args) {
		
		//isso não funciona mais, por causa da classe abstract
		//Produto p = new Produto();
		
		Produto p = new ProdutoPerecivel();//usando polimorfismo
		p.descricao = "Caixa de Leite";
		
		ProdutoPerecivel pp = (ProdutoPerecivel) p;//casting
		pp.dataValidade = "10/03/12";
		
		p.imprimirDescricao();
		
		
		System.out.println();
		
		//Outra forma
//		ProdutoPerecivel ppp = new ProdutoPerecivel();
//		ppp.descricao = "Refrigerante";
//		ppp.dataValidade = "15/03/16";
//		
//		ppp.imprimirDescricao();
		
		
		
	}
	
}
