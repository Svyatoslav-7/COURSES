package W10_june3_tusk4;

import java.util.ArrayList;
import java.util.List;

public class Friends {
    List<String> friends=new ArrayList<>();

    public void addFriends(List<String> friends, String Name){
        friends.add(Name);
    }

    public void enterFriends(List<String> friends){
        for(int i =0; i<friends.size(); i++){
            System.out.println(friends.get(i));
        }
    }
}
