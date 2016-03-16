package aula37;

/*Boxing java
 * */

public class Principal {

	public static void main(String[] args) {
		
		// este é o padrão
		Integer i = new Integer(10);
		
		//funciona tb - Boxing
		Integer ii = 10;
		
		// Unboxing
		int x = i;
		
		/*Dependendo do programa poderá perder desempenho,
		 * pois o Java está converterndo esses valores
		 * 
		 * */
		
		// a forma correta
		int xx = i.intValue();
		
		
		System.out.println("##################################");
		
		Integer i1 = 127;
		Integer i2 = 127;
		
		Integer i3 = 128;
		Integer i4 = 128;
		
		System.out.println(i1 == i2);//true
		System.out.println(i3 == i4);//false
		
		//Intervalo do Integer -128 a 127 - funciona
		
		System.out.println("##################################");
		
		System.out.println("Forma correta de comparar objetos");
		
		System.out.println(i1.equals(i2));//true
		System.out.println(i3.equals(i4));//true
		
		
	}

}
