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
    private Nadador nadador;

    public AgResultado(IChromosome chromosome) {
        mejorCromosoma = Cromosoma.create(chromosome);
        nadador = MapCromosomas.map.get(mejorCromosoma.valorCromosoma());
    }

    public Cromosoma getMejorCromosoma() {
        return mejorCromosoma;
    }

    public Nadador getUnidad() {
        return nadador;
    }
}
