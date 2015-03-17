package quan.languagesupport;

import java.io.File;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DBOperation {
	public static final String LANGUAGE_DIR="xml/";
	private String uri;
	private HashMap<String, String> list;
	
	public DBOperation(String language) {
		list = new HashMap<>();
		this.uri = LANGUAGE_DIR + language.toLowerCase() + ".xml";
	}
	
	public void addToList(Pair pair) {
		this.list.put(pair.getKey(), pair.getValue());
	}
	
	public HashMap<String, String> getData() {
		return this.list;
	}
	
	public void initDB() {
		try {
			File fXmlFile = new File(this.uri);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();
			
			NodeList nList = doc.getElementsByTagName("string");
			int nListLength = nList.getLength();
			
			for (int temp = 0; temp < nListLength; temp++) {
				final Node nNode = nList.item(temp);		 
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					final Element eElement = (Element) nNode;
					addToList(new Pair(eElement.getAttribute("name"), eElement.getTextContent()));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
