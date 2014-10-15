package utn.config;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

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


	public void parse() throws SAXException, IOException, ParserConfigurationException{
		
	    SAXParserFactory parserFactor = SAXParserFactory.newInstance();
		SAXParser parser = parserFactor.newSAXParser();
		parser.parse(new File("CONFIG/Config.xml"), this);
	}
	
	public ConfigurationManager() throws SAXException, IOException, ParserConfigurationException{
		this.parse();
	}
	
}

