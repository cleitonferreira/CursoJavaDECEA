package aula38;

/*Trabalhando com arrays em java
 * */

public class TesteArrays {

	public static void main(String[] args) {
		
		//int[] notas;
		//notas = new int[4];
		
		int[] notas = new int[4];
		notas[0] = 10;
		notas[1] = 5;
		notas[2] = 8;
		notas[3] = 9;
		
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Posicao[" + i + "]=" + notas[i]);
//		}
		
		//notas é um objeto de tipo Array
		//usando método length
		System.out.println("Nota do primeiro aluno: " + notas[0]);
		
		System.out.println("Tamanho do array: " + notas.length);
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Posicao[" + i + "]=" + notas[i]);
		}
		
	}
	
}
