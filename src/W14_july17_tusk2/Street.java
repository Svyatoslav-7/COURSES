package W14_july17_tusk2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Street {
    private String name;
    private int building;

    public void setName(String name) {
        this.name = name;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public Element toDOMElement(Document document) {
        Element streetElement = document.createElement("street");

        Element nameElement = document.createElement("name");
        nameElement.setTextContent(name);
        streetElement.appendChild(nameElement);

        Element buildingElement = document.createElement("building");
        buildingElement.setTextContent(String.valueOf(building));
        streetElement.appendChild(buildingElement);

        return streetElement;
    }
}
