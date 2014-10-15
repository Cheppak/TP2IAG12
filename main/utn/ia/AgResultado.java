package utn.ia;

import org.jgap.IChromosome;

import utn.ia.nadadores.Nadador;

/**
 * Nos devuelve el resultado de la corrida, el mejor cromosoma.
 * @author Cheppak
 *
 */
public class AgResultado {

    private Cromosoma mejorCromosoma;
    private int fitnessValue;
    private String nadador;

    public AgResultado(IChromosome chromosome) {
        mejorCromosoma = Cromosoma.create(chromosome);
        nadador = mejorCromosoma.valorCromosoma();
        fitnessValue = (int) chromosome.getFitnessValue();
    }

    public Cromosoma getMejorCromosoma() {
        return mejorCromosoma;
    }

    public String getUnidad() {
        return nadador;
    }
    
    public int getFitnessValue() {
    	return fitnessValue;
    }
}
