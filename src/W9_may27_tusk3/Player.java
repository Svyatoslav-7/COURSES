package W9_may27_tusk3;

public class Player implements Playable, Recodable{

    @Override
    public void play() {
        System.out.println("Music play;");
    }

    @Override
    public void pausePlay() {
        System.out.println("Pause play music;");
    }

    @Override
    public void stopPlay() {
        System.out.println("Stop play music;");
    }

    @Override
    public void record() {
        System.out.println("Rec music;");
    }

    @Override
    public void pauseRec() {
        System.out.println("Pause rec music;");
    }

    @Override
    public void stopRec() {
        System.out.println("Stop rec music;");
    }
}
