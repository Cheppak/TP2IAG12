package utn.ia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utn.ia.nadadores.Nadador;
import utn.ia.nadadores.NadadorCroll;
import utn.ia.nadadores.NadadorEspalda;
import utn.ia.nadadores.NadadorFartlek;
import utn.ia.nadadores.NadadorMariposa;
import utn.ia.nadadores.NadadorPecho;

/**
 * El universo de nuestros Cromosomas.
 * @author Cheppak
 */
public class MapCromosomas {

	
    /**
     * Lista a todos tipos de cromosomas.
     */
    public final static List<Cromosoma> cromosomas;
    
    /**
     * Valor x Cromosoma.
     */
    public final static Map<Integer, Nadador> map;
    
    private static void addCromosoma(Nadador nadador) {
        //map.put(nadador.cromosoma().valorCromosoma(), nadador);
        cromosomas.add(nadador.cromosoma());
    }
        
    static {
        cromosomas = new ArrayList<>();
        map = new HashMap<>();                
        addCromosoma(new NadadorCroll());
        addCromosoma(new NadadorEspalda());
        addCromosoma(new NadadorFartlek());
        addCromosoma(new NadadorMariposa());
        addCromosoma(new NadadorPecho());
    }
            
}
