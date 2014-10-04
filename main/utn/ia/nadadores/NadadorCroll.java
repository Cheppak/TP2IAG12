package utn.ia.nadadores;

import utn.ia.Cromosoma;

public class NadadorCroll extends Nadador {

	@Override
	public Cromosoma cromosoma() {

		return new Cromosoma(2,1,2,1);
	}

}
