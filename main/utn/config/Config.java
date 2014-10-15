package utn.config;

public class Config {

	private int population;
	private int mutationRate;
	private int vueltas;
	private int nadadoresCroll;
	private int nadadoresPecho;
	private int nadadoresFarkel;
	private int nadadoresEspalda;
	private int nadadoresMariposa;
	private double indiceGrasaCorporal;
	
	public Config(int population, int mutationRate, int nadadoresCroll,
			int nadadoresPecho, int nadadoresFarkel, int nadadoresEspalda,
			int nadadoresMariposa, double indiceGrasaCorporal) {
		super();
		this.setPopulation(population);
		this.setMutationRate(mutationRate);
		this.setNadadoresCroll(nadadoresCroll);
		this.setNadadoresPecho(nadadoresPecho);
		this.setNadadoresFarkel(nadadoresFarkel);
		this.setNadadoresEspalda(nadadoresEspalda);
		this.setNadadoresMariposa(nadadoresMariposa);
		this.setIndiceGrasaCorporal(indiceGrasaCorporal);
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

	public int getNadadoresCroll() {
		return nadadoresCroll;
	}

	public void setNadadoresCroll(int nadadoresCroll) {
		this.nadadoresCroll = nadadoresCroll;
	}

	public int getNadadoresPecho() {
		return nadadoresPecho;
	}

	public void setNadadoresPecho(int nadadoresPecho) {
		this.nadadoresPecho = nadadoresPecho;
	}

	public int getNadadoresFarkel() {
		return nadadoresFarkel;
	}

	public void setNadadoresFarkel(int nadadoresFarkel) {
		this.nadadoresFarkel = nadadoresFarkel;
	}

	public int getNadadoresEspalda() {
		return nadadoresEspalda;
	}

	public void setNadadoresEspalda(int nadadoresEspalda) {
		this.nadadoresEspalda = nadadoresEspalda;
	}

	public int getNadadoresMariposa() {
		return nadadoresMariposa;
	}

	public void setNadadoresMariposa(int nadadoresMariposa) {
		this.nadadoresMariposa = nadadoresMariposa;
	}

	public int getVueltas() {
		return vueltas;
	}

	public void setVueltas(int vueltas) {
		this.vueltas = vueltas;
	}

	public double getIndiceGrasaCorporal() {
		return indiceGrasaCorporal;
	}

	public void setIndiceGrasaCorporal(double indiceGrasaCorporal) {
		this.indiceGrasaCorporal = indiceGrasaCorporal;
	}
}
