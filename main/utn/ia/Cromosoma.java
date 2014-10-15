package utn.ia;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DoubleGene;
import org.jgap.impl.IntegerGene;

/**
 * Implementacion del Cromosoma. <br>
 * [ALTURA, EXTREMIDADES, FUERZA, TORAX]
 *	@author Cheppak
 */
public class Cromosoma {

	public static final int POS_ALTURA = 0;
	public static final int POS_EXTREMIDADES = 1;
	public static final int POS_FUERZA = 2;
	public static final int POS_TORAX = 3;
	public static final int POS_GRASA = 4;
	
	private final int altura;
    private final int extremidades;
    private final int fuerza;
    private final int torax;
    private final double grasa;
   
	
	public Cromosoma(int altura, int extremidades, int fuerza, int torax, double grasa) {
		this.altura = altura;
		this.extremidades = extremidades;
		this.fuerza = fuerza;
		this.torax = torax;
		this.grasa = grasa;
	}

	public static Gene[] buildGenes(Configuration conf) throws InvalidConfigurationException {
        Gene[] genes = new Gene[5];
        genes[0] = new IntegerGene(conf, 0, 3);
        genes[1] = new IntegerGene(conf, 0, 3);
        genes[2] = new IntegerGene(conf, 0, 3);
        genes[3] = new IntegerGene(conf, 0, 3);
        genes[4] = new DoubleGene(conf, 1, 3);
        return genes;
    }
	
	  public static Cromosoma create(IChromosome ic) {
		  
		  int altura = (int) ic.getGene(0).getAllele();
	      int extremidades = (int) ic.getGene(1).getAllele();
	      int fuerza = (int) ic.getGene(2).getAllele();
	      int torax = (int) ic.getGene(3).getAllele();
	      double igc = (double) ic.getGene(4).getAllele();
	      Cromosoma instance = new Cromosoma(altura, extremidades, fuerza, torax, igc);
	      return instance; 
	  }

    /**
     * Hacen unico al cromosoma, para luego buscarlo ...
	 * @param altura
	 * @param extremidades
	 * @param fuerza
	 * @param torax
	 * @return
	 */
	public static String valueOf(int altura, int extremidades, int fuerza, int torax) {
	        return Integer.toBinaryString(altura) + Integer.toBinaryString(extremidades) + 
	        		Integer.toBinaryString(fuerza) + Integer.toBinaryString(torax) ;
	    }

	 /**
	 * Valor para este cromosoma en particular
	 * @return
	 */
	public String valorCromosoma() {
	        return valueOf(getAltura(), getExtremidades(), getFuerza(), getTorax());
	    }
	  
	public int getExtremidades() {
		return extremidades;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getTorax() {
		return torax;
	}

	public int getAltura() {
		return altura;
	}
	
	public double getIGC() {
		return grasa;
	}
	
}
