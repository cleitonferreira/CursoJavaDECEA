package aula45.treinador;

import aula45.animal.Cachorro;

/*
 * Modificadores de acesso default
 * */

public class TreinadorCachorro {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Bob");
		
		DonoCachorro dono = new DonoCachorro();
		dono.ensinarCachorroSentar(cachorro);
	}

}
