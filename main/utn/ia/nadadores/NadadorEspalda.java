package utn.ia.nadadores;

import utn.ia.Cromosoma;

public class NadadorEspalda extends Nadador{

	@Override
	public Cromosoma cromosoma() {
		return new Cromosoma(1,3,4,2);
	}

	@Override
	public String nombre() {
		return "NadadorEspalda";
	}

}
