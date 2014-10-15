package utn.ia;

import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
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
	
	private final int altura;
    private final int extremidades;
    private final int fuerza;
    private final int torax;
   
	
	public Cromosoma(int altura, int extremidades, int fuerza, int torax) {
		this.altura = altura;
		this.extremidades = extremidades;
		this.fuerza = fuerza;
		this.torax = torax;
	}

	public static Gene[] buildGenes(Configuration conf) throws InvalidConfigurationException {
        Gene[] genes = new Gene[4];
        genes[0] = new IntegerGene(conf, 0, 3);
        genes[1] = new IntegerGene(conf, 0, 3);
        genes[2] = new IntegerGene(conf, 0, 3);
        genes[3] = new IntegerGene(conf, 0, 3);
        return genes;
    }
	
	  public static Cromosoma create(IChromosome ic) {
		  
		  int altura = (int) ic.getGene(0).getAllele();
	      int extremidades = (int) ic.getGene(1).getAllele();
	      int fuerza = (int) ic.getGene(2).getAllele();
	      int torax = (int) ic.getGene(3).getAllele();
	      Cromosoma instance = new Cromosoma(altura, extremidades, fuerza, torax);
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
	
}
