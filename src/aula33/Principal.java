package aula33;

/*
 * Métodos com retorno
 * */

public class Principal {

	public static void main(String[] args) {
		Paciente p = new Paciente();
		p.peso = 100;
		p.altura = 1.65;
		
		double imcCalculado = p.calcularIMC();
		System.out.println("IMC do Paciente: " + imcCalculado);
		
		System.out.println("#################################");
		
		
		IMC imc = p.calcularIndiceDeMassaCorporal();
		
		System.out.println("Abaixo do peso ideal: " + imc.abaixoDoPesoIdeal);
		System.out.println("Peso ideal: " + imc.pesoIdeal);
		System.out.println("Obeso: " + imc.obeso);
		System.out.println("Grau de obesidade: " + imc.grauObesidade);
	}
	
}
