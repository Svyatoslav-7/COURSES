package W14_july17_tusk2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.transform.dom.DOMSource;
import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private String size;
    private List<Street> streets;

    public City() {
        streets = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addStreet(Street street) {
        streets.add(street);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public List<Street> getStreets() {
        return streets;
    }

    public DOMSource toDOMSource() {
        Document document = XMLUtils.createDocument();
        Element cityElement = document.createElement("city");
        cityElement.setAttribute("size", size);
        cityElement.setTextContent(name);

        for (Street street : streets) {
            Element streetElement = street.toDOMElement(document);
            cityElement.appendChild(streetElement);
        }

        document.appendChild(cityElement);
        return new DOMSource(document);
    }
}
