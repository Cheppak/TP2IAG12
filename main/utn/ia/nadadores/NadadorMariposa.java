package utn.ia.nadadores;

import utn.ia.Cromosoma;

public class NadadorMariposa extends Nadador {

	@Override
	public Cromosoma cromosoma() {
		return new Cromosoma(3,1,0,2);
	}


	@Override
	public String nombre() {
		return "NadadorMariposa";
	}
}
