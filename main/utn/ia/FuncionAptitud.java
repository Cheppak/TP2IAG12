package utn.ia;

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

public class FuncionAptitud extends FitnessFunction  {

	@Override
	protected double evaluate(IChromosome arg0) {

		int altura = (int) arg0.getGene(Cromosoma.POS_ALTURA).getAllele();
		int extremidades = (int) arg0.getGene(Cromosoma.POS_EXTREMIDADES).getAllele();
		int fuerza = (int) arg0.getGene(Cromosoma.POS_FUERZA).getAllele();
		int torax = (int) arg0.getGene(Cromosoma.POS_TORAX).getAllele();
		
		
		//TODO: Aplico funcion aptitud!
		
		return 0;
	}

}
