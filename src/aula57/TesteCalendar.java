package aula57;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * Trabalhando com datas
 * */

public class TesteCalendar {

	//subtrair, soma ...
	
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
		
		c.set(Calendar.DAY_OF_MONTH, 31);
		c.set(Calendar.MONTH, 0);
		c.set(Calendar.YEAR, 2010);
		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 30);
		c.set(Calendar.SECOND, 0);
		
		DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(formatador.format(c.getTime()));
		
		// subtrai 1 dia na data
		c.roll(Calendar.DAY_OF_MONTH, -1);
		System.out.println(formatador.format(c.getTime()));
		
		// soma 1 mês na data
		c.add(Calendar.MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		// soma 1 dia na data
		c.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(formatador.format(c.getTime()));
		
		//roll - no nosso caso, só altera o dia
		c.roll(Calendar.DAY_OF_MONTH, -1);
		System.out.println(formatador.format(c.getTime()));
		
	}
	
}
