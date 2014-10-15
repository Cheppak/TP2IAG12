package utn.config;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ConfigurationManager  extends DefaultHandler  {

	private Config config = null;
	String text = null;
    private static List<Config> configList = new ArrayList<Config>();

	
    public void startElement(String uri, String localName, String qName, Attributes attributes)
          throws SAXException {
 
          switch (qName) {
               // Create a new config.
               case "config": {
                    setConfig(new Config());
                    break;
               }
         }
     }
          
    public void endElement(String uri, String localName, String qName) throws SAXException {
          switch (qName) {
               case "config": {
            	   configList.add(getConfig());
                   break;
               }
               case "population": {
            	   getConfig().setPopulation(Integer.parseInt(text));
            	   break;
               }
               case "mutationRate": {
            	   getConfig().setMutationRate(Integer.parseInt(text));
            	   break;
               }
               case "vueltas": {
            	   getConfig().setVueltas(Integer.parseInt(text));
            	   break;
               }
               case "nadadoresCroll": {
                    getConfig().setNadadoresCroll(Integer.parseInt(text));
                    break;
               }
               case "nadadoresFarkel": {
            	   getConfig().setNadadoresFarkel(Integer.parseInt(text));
            	   break;
               }
               case "nadadoresEspalda": {
            	   getConfig().setNadadoresEspalda(Integer.parseInt(text));
            	   break;
               }
               case "nadadoresMariposa": {
            	   getConfig().setNadadoresMariposa(Integer.parseInt(text));
            	   break;
               }
               case "indiceGrasaCorporal":{
            	   getConfig().setIndiceGrasaCorporal(Double.parseDouble(text));
               }
          }
     }

    @Override
         public void characters(char[] ch, int start, int length) throws SAXException {
              text = String.copyValueOf(ch, start, length).trim();
         }

	public Config getConfig() {
		return config;
	}

	public void setConfig(Config config) {
		this.config = config;
	}

	
}
