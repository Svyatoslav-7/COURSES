package W10_june3_tusk4;

/*
Використовуючи Intelij IDEA, створити клас Friends. За допомогою методів ArrayList додати масив імена друзів. Вивести
список друзів, після вивести список друзів, відсортувавши в алфавітному порядку.
*/

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Friends friends=new Friends();

        friends.addFriends(friends.friends, "Артем");
        friends.addFriends(friends.friends, "Кевін");
        friends.addFriends(friends.friends, "Рома");
        friends.addFriends(friends.friends, "Ярко");
        friends.addFriends(friends.friends, "Діма");

        friends.enterFriends(friends.friends);

        Collections.sort(friends.friends);
        System.out.println(" ");
        friends.enterFriends(friends.friends);
    }
}
