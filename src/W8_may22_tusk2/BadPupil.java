package W8_may22_tusk2;

public class BadPupil extends Pupil{


    @Override
    public void read() {
        System.out.println("Bad reader");
    }

    @Override
    public void relax() {
        System.out.println("Allot of relax");
    }

    @Override
    public void study() {
        System.out.println("Bad study");
    }

    @Override
    public void write() {
        System.out.println("Bad write");
    }
}
