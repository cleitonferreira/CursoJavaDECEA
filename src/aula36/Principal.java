package aula36;

/*Wrappers java lang*/

public class Principal {

	public static void main(String[] args) {
		int x = 10;
		Integer i = new Integer(10);
		byte b = i.byteValue(); 
		double d = i.doubleValue();
		
 //Tipos primitivos - Classes Wrappers		
		//byte		- Byte
		//short		- Short
		//int		- Integer
		//long		- Long
		//float		- Float
		//double	- Double
		//char		- Character
				
				
		System.out.println("Byte: "+b);
		System.out.println("Double: "+d);
	
	}
	
}
