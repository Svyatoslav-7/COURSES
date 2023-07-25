package W10_june3_tusk2;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<String> animals=new ArrayList<>();

    public void addAnimals(List<String> animals, String element){
        animals.add(element);
    }

    public void enterAnimals(List<String> animals){
        for(int i =0; i<animals.size(); i++){
            System.out.println(i+" "+animals.get(i));
        }
    }

    public void deleteAnimals(List<String> animals){
        System.out.println(" ");
        System.out.println("Right now size is: "+animals.size());
        System.out.println(" ");

        animals.remove(7);
        animals.remove(5);
        animals.remove(3);

        System.out.println("After delete 3, 5, 7 numbers we have size: "+animals.size());
    }
}
