package utn.config;

public class Config {

	private int population;
	private int mutationRate;
	private int vueltas;
	
	public Config(int population, int mutationRate, int vueltas) {
		super();
		this.setPopulation(population);
		this.setMutationRate(mutationRate);
		this.setVueltas(vueltas);
	}

	public Config(){
		
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public int getMutationRate() {
		return mutationRate;
	}

	public void setMutationRate(int mutationRate) {
		this.mutationRate = mutationRate;
	}

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}

}
