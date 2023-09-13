package W14_july17_tusk2;

/*
Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу. Необхідно, щоб проект створював XML-файл і
будував дерево (місто, назва вулиці, будинок). У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).
*/

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class XMLParser extends DefaultHandler {
    private StringBuilder currentData;
    private City currentCity;
    private Street currentStreet;
    private Building currentBuilding;
    private StringBuilder xmlData;

    public void parseXML(String filePath) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            saxParser.parse(new File(filePath), this);

            buildXML();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void buildXML() throws TransformerException {
        City city = new City();
        city.setName(currentCity.getName());
        city.setSize(currentCity.getSize());
        city.getStreets().addAll(currentCity.getStreets());

        DOMSource domSource = city.toDOMSource();

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult streamResult = new StreamResult(new File("city_output.xml"));
        transformer.transform(domSource, streamResult);
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        currentData = new StringBuilder();

        if ("city".equalsIgnoreCase(qName)) {
            currentCity = new City();
            String size = attributes.getValue("size");
            currentCity.setSize(size);
        } else if ("name".equalsIgnoreCase(qName) && currentCity != null) {
            currentCity.setName(currentData.toString().trim());
        }
    }

    public String getCurrentCityName() {
        return currentCity.getName();
    }

    public String getCurrentCitySize() {
        return currentCity.getSize();
    }

    public List<Street> getCurrentCityStreets() {
        return currentCity.getStreets();
    }
}
