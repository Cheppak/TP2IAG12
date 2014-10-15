package utn.ia;

import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

/**
* F fitness =  ( 40*A + 10*P + 20*H + 30*E ) / Indice Grasa Corporal
*	H: Altura. 							Ponderación; 20 
*	E: El tamaño de las extremidades. 	Ponderacion; 30.
*	P: Potencia y fuerza.  				Ponderacion; 10.
*	A: Amplitud del torax. 				Ponderacion; 40.
*
* @author Cheppak
*
*/
public class FuncionAptitud extends FitnessFunction  {

	//public static int INDICE_GRASA_CORPORAL = 20;
	
	@Override
	protected double evaluate(IChromosome arg0) {

		int h = (int) arg0.getGene(Cromosoma.POS_ALTURA).getAllele();
		int e = (int) arg0.getGene(Cromosoma.POS_EXTREMIDADES).getAllele();
		int p = (int) arg0.getGene(Cromosoma.POS_FUERZA).getAllele();
		int a = (int) arg0.getGene(Cromosoma.POS_TORAX).getAllele();
		double igc = (double) arg0.getGene(Cromosoma.POS_GRASA).getAllele();
		
		return (double) ((40*a + 10*p + 20*h + 30*e) / igc);
	}

}
