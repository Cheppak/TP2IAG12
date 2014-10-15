package utn.ia;

import java.io.File;
import java.io.IOException;








import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;




import org.xml.sax.SAXException;

import utn.config.Config;
import utn.config.ConfigurationManager;


public class Main {

	public static void main (String [ ] args) throws ParserConfigurationException, SAXException, IOException {

        AgController controller = new AgController();
        
        ConfigurationManager config = new ConfigurationManager();
        
        controller.setMutationRate(config.getConfig().getMutationRate());
        controller.setPopulationSize(config.getConfig().getPopulation());
        controller.setVueltas(config.getConfig().getVueltas());
        try {
            AgResultado result = controller.run();
            System.out.println("Altura " + String.valueOf(result.getMejorCromosoma().getAltura()));
            System.out.println("Extremidades " + String.valueOf(result.getMejorCromosoma().getExtremidades()));
            System.out.println("Fuerza " + String.valueOf(result.getMejorCromosoma().getFuerza()));
            System.out.println("Torax " + String.valueOf(result.getMejorCromosoma().getTorax()));
            System.out.println("Indice grasa corporal " + String.valueOf(result.getMejorCromosoma().getIGC()));
            System.out.println("Cromosoma elegido: " + result.getUnidad());
            System.out.println("Función Aptitud: " + result.getFitnessValue());
            //System.out.println("Nombre unidad: " + String.valueOf(result.getUnidad().nombreByCromosoma(result.getMejorCromosoma())));
        } catch(Exception e) {
            throw new RuntimeException("Error al ejecutar", e);
        }
	}
	
}
