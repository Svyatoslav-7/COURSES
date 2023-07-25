package W8_may22_tusk4;

public class ProDocumentWorker extends DocumentWorker{
    @Override
    public void saveDocument(){
        System.out.println("Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт");
    }
    @Override
    public void editDocument(){
        System.out.println("Документ відредаговано");
    }
}
