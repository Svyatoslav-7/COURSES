package W8_may22_tusk2;

public class GoodPupil extends Pupil{
    @Override
    public void read() {
        System.out.println("Good reader");
    }

    @Override
    public void relax() {
        System.out.println("Normal time of relax");
    }

    @Override
    public void study() {
        System.out.println("Good study");
    }

    @Override
    public void write() {
        System.out.println("Good write");
    }
}
