package utn.ia;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class Main {

	public static void main (String [ ] args) {

        AgController controller = new AgController();
        
        //SAX
        controller.setPopulationSize(10);
        controller.setMutationRate(10);
        controller.setVueltas(10);
        
        //TODO reemplazar por configurationManager o algo asi
        /*Main configManager = new Main();
        configManager.getConfig();*/
        
        //DESCOMENTAR PAR PROBAR !!!! 
        controller.setqNadadoresCroll(10);
        controller.setqNadadoresEspalda(40);
        controller.setqNadadoresFartlek(30);
        controller.setqNadadoresMariposa(60);
        controller.setqNadadoresPecho(20);
        
        
        try {
            AgResultado result = controller.run();
            System.out.println("Altura " + String.valueOf(result.getMejorCromosoma().getAltura()));
            System.out.println("Extremidades " + String.valueOf(result.getMejorCromosoma().getExtremidades()));
            System.out.println("Fuerza " + String.valueOf(result.getMejorCromosoma().getFuerza()));
            System.out.println("Torax " + String.valueOf(result.getMejorCromosoma().getTorax()));
            System.out.println("Cromosoma elegido: " + result.getUnidad());
            System.out.println("Función Aptitud: " + result.getFitnessValue());
            //System.out.println("Cantidad " + String.valueOf(result.getMejorCromosoma().getCantidad()));                    
            //System.out.println("Nombre unidad: " + String.valueOf(result.getUnidad().nombreByCromosoma(result.getMejorCromosoma())));
        } catch(Exception e) {
            throw new RuntimeException("Error al ejecutar", e);
        }
	}
	
     private void getConfig(){
 		SAXParserFactory spf = SAXParserFactory.newInstance();

 		try {

			SAXParser sp = spf.newSAXParser();
			DefaultHandler dh = new DefaultHandler();
			sp.parse(new File("CONFIG/Config.xml"),dh);
			sp.getProperty("population");

 		}catch(SAXException se) {
			se.printStackTrace();
		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}
 		
    	 
     }
}
