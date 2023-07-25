package W8_may22_tusk2;

public class ClassRoom {
    private Pupil pupil1;
    private Pupil pupil2;
    private Pupil pupil3;
    private Pupil pupil4;

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = pupil4;
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = new Pupil();
        this.pupil4 = new Pupil();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupil1 = pupil1;
        this.pupil2 = pupil2;
        this.pupil3 = pupil3;
        this.pupil4 = new Pupil();
    }

    public void showInfo(){
        pupil1.read();
        pupil1.relax();
        pupil1.study();
        pupil1.study();

        pupil2.read();
        pupil2.relax();
        pupil2.study();
        pupil2.study();

        pupil3.read();
        pupil3.relax();
        pupil3.study();
        pupil3.study();

        pupil4.read();
        pupil4.relax();
        pupil4.study();
        pupil4.study();
    }
}
