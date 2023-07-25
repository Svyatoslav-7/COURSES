package W9_may27_tusk2;

public class ArtDeco_Furniture extends FactoryList {
    {
        armchairName="Пустельна кість";
        sofaName="Дивний узор";
        tableName="Різкий вид";

        priseArmchair=1843;
        priceSofa=3785;
        priceTable=4122;
    }

    public void enterInformation(){
        System.out.println("------------------");
        System.out.println(" ");
        System.out.println("Детальний опис: ");
        System.out.println("Крісло - `"+armchairName+"`, "+priseArmchair+" грн.");
        System.out.println("Диван - `"+sofaName+"`, "+priceSofa+" грн.");
        System.out.println("Стіл - `"+tableName+"`, "+priceTable+" грн.");
        double allPrice=priceSofa+priceTable+priseArmchair;
        System.out.println("Загальна сума: "+allPrice);
        System.out.println(" ");
        System.out.println("------------------");
    }

}
