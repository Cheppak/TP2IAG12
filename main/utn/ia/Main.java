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
        
        //SAX
        controller.setPopulationSize(10);
        controller.setMutationRate(10);
        controller.setVueltas(10);
        
        //TODO reemplazar por configurationManager o algo asi

        ConfigurationManager configManager = new ConfigurationManager();
        
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        ConfigurationManager handler = new ConfigurationManager();
         
        parser.parse(new File("CONFIG/Config.xml"), handler);

        controller.setqNadadoresCroll(handler.getConfig().getNadadoresCroll());
        controller.setqNadadoresEspalda(handler.getConfig().getNadadoresEspalda());
        controller.setqNadadoresFartlek(handler.getConfig().getNadadoresFarkel());
        controller.setqNadadoresMariposa(handler.getConfig().getNadadoresMariposa());
        controller.setqNadadoresPecho(handler.getConfig().getNadadoresPecho());
        controller.setMutationRate(handler.getConfig().getMutationRate());
        controller.setPopulationSize(handler.getConfig().getPopulation());
        controller.setVueltas(handler.getConfig().getVueltas());
        controller.setIndiceMasaCorporal(handler.getConfig().getIndiceGrasaCorporal());
        try {
            AgResultado result = controller.run();
            System.out.println("Altura " + String.valueOf(result.getMejorCromosoma().getAltura()));
            System.out.println("Extremidades " + String.valueOf(result.getMejorCromosoma().getExtremidades()));
            System.out.println("Fuerza " + String.valueOf(result.getMejorCromosoma().getFuerza()));
            System.out.println("Torax " + String.valueOf(result.getMejorCromosoma().getTorax()));
            System.out.println("Cromosoma elegido: " + result.getUnidad());
            System.out.println("Funci�n Aptitud: " + result.getFitnessValue());
            //System.out.println("Cantidad " + String.valueOf(result.getMejorCromosoma().getCantidad()));                    
            //System.out.println("Nombre unidad: " + String.valueOf(result.getUnidad().nombreByCromosoma(result.getMejorCromosoma())));
        } catch(Exception e) {
            throw new RuntimeException("Error al ejecutar", e);
        }
	}
	
}
