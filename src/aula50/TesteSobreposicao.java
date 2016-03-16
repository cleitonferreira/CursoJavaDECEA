package aula50;

import java.util.Date;

/*Sobreposição de métodos*/

public class TesteSobreposicao {

	public static void main(String[] args) {
		ProdutoPerecivel pp = new ProdutoPerecivel();
		pp.descricao = "Caixa de fósforo";
		pp.dataValidade = new Date();//data atual
		pp.identificar();
	}
	
}
