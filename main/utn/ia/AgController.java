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
	private int vueltas = 100;
	private int qNadadoresCroll;
	private int qNadadoresPecho;
	private int qNadadoresMariposa;
	private int qNadadoresEspalda;
	private int qNadadoresFartlek;

	
	public AgResultado run() throws InvalidConfigurationException{
		
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
		population.evolve(getVueltas());
		
		return new AgResultado(population.getFittestChromosome());
	}
	
	public void setPopulationSize(int populationSize) {
		this.populationSize = populationSize;
	}

	public void setMutationRate(int mutationRate) {
		this.mutationRate = mutationRate;
	}

	public int getqNadadoresCroll() {
		return qNadadoresCroll;
	}

	public void setqNadadoresCroll(int qNadadoresCroll) {
		this.qNadadoresCroll = qNadadoresCroll;
	}

	public int getqNadadoresMariposa() {
		return qNadadoresMariposa;
	}

	public void setqNadadoresMariposa(int qNadadoresMariposa) {
		this.qNadadoresMariposa = qNadadoresMariposa;
	}

	public int getqNadadoresEspalda() {
		return qNadadoresEspalda;
	}

	public void setqNadadoresEspalda(int qNadadoresEspalda) {
		this.qNadadoresEspalda = qNadadoresEspalda;
	}

	public int getqNadadoresFartlek() {
		return qNadadoresFartlek;
	}

	public void setqNadadoresFartlek(int qNadadoresFartlek) {
		this.qNadadoresFartlek = qNadadoresFartlek;
	}

	public int getqNadadoresPecho() {
		return qNadadoresPecho;
	}

	public void setqNadadoresPecho(int qNadadoresPecho) {
		this.qNadadoresPecho = qNadadoresPecho;
	}

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}
	
	
	
	
	
}
