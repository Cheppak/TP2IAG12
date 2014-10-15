package utn.ia.nadadores;

import utn.ia.Cromosoma;

public class NadadorPecho extends Nadador {

	@Override
	public Cromosoma cromosoma() {
		return new Cromosoma(1,1,1,1);
	}

	@Override
	public String nombre() {
		return "NadadorPecho";
	}

}
