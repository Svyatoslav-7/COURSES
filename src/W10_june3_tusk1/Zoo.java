package W10_june3_tusk1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    List<String> animals=new ArrayList<>();

    public void addAnimals(List<String> animals, String element){
        animals.add(element);
    }

    public void enterAnimals(List<String> animals){
        for(int i =0; i<animals.size(); i++){
            System.out.println(animals.get(i));
        }
    }
}
