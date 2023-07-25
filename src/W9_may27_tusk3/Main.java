package W9_may27_tusk3;

/*
 Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створіть 2 інтерфейси Playable та Recodable. У кожному з
інтерфейсів створіть по 3 методи void play() / void pause() / void stop() та void record() / void pause() / void stop()
відповідно. Створіть похідний клас Player від базових інтерфейсів Playable та Recodable. Написати програму, яка виконує
програвання та запис.
 */

public class Main {
    public static void main(String[] args) {
        Player player=new Player();
        player.play();
        player.pausePlay();
        player.stopPlay();
        player.record();
        player.pauseRec();
        player.stopRec();
    }
}
