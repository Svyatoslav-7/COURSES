package W9_may27_tusk2;

public class Modern_Furniture extends FactoryList{
    {
        armchairName="Стар шіп";
        sofaName="Гіпер портал";
        tableName="Пульт керування";

        priseArmchair=2340;
        priceSofa=7340;
        priceTable=4340;
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
