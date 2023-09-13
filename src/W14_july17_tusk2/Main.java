package W14_july17_tusk2;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Svyatoslav\\Desktop\\itea\\java\\COURSES\\src\\W14_july17_tusk2\\city.xml";

        XMLParser xmlParser = new XMLParser();
        xmlParser.parseXML(filePath);

        System.out.println("Parsed City Name: " + xmlParser.getCurrentCityName());
        System.out.println("Parsed City Size: " + xmlParser.getCurrentCitySize());
        System.out.println("Parsed City Streets: " + xmlParser.getCurrentCityStreets());

        System.out.println("New XML File 'city_output.xml' has been created.");
    }
}
