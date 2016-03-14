package aula10;

public class ConversaoTipoPrimitivo {

	public static void main(String[] args) {
		
		// não funciona
		//long x = 10;
		//int y = x;
		
		
		// isso funciona
		long x = 9300000035L;
		int y = (int) x;
		System.out.println(y);
		
		// isso tb funciona
		int yy = 102344;
		long xx = yy;
		System.out.println(xx);
		
		// isso tb funciona
		double a = 20.5;
		float b = (float) a;
		System.out.println(b);
		
		// isso tb funciona - o casting é feito automaticamente
		float c = 934.5f;
		double d = c;
		System.out.println(d);
				
		
		
		
		double largura = 100.37;
		
		//casting 
		int tamanho = (int) largura;
		
		System.out.println(tamanho);
	}


}