package utn.ia.nadadores;

import utn.ia.Cromosoma;

public class NadadorFartlek extends Nadador {

	@Override
	public Cromosoma cromosoma() {
		return new Cromosoma(2,2,2,2,2);
	}

	@Override
	public String nombre() {
		return "NadadorFartlek";
	}
}
