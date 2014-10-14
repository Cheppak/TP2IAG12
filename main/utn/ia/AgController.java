package utn.ia;

import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.MutationOperator;

/**
 * Ejecuta la corrida.
 * @author Cheppak
 *
 */
public class AgController {
	
	private int populationSize = 0;
	private int mutationRate = 0;
	private int qVueltas = 0;

	
	public void run() throws InvalidConfigurationException{
		Configuration.reset();
		Configuration config = new DefaultConfiguration();
		FitnessFunction function = new FuncionAptitud();
		config.setFitnessFunction(function);
		Gene[] genes = Cromosoma.buildGenes(config);
		Chromosome chromosome = new Chromosome(config, genes);
		config.setSampleChromosome(chromosome);
		config.setPopulationSize(populationSize);
		MutationOperator mutation = new MutationOperator(config);
		mutation.setMutationRate(mutationRate);
		Genotype population = Genotype.randomInitialGenotype(config);
		population.evolve(qVueltas);
		
		//TODO implementar lugar donde guardamos la poblacion ... (puede ser como el "mapa")
		//EL ES EL MEJOR DE LA CORRIDA -> population.getFittestChromosome()
	}
	
}
