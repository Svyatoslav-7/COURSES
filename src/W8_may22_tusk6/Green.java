package W8_may22_tusk6;

public class Green extends Printer{

    public Green(String value) {
        super(value);
    }

    @Override
    public void print(String value){
        System.out.print("\033[32m");
        System.out.println(value);
        System.out.print("\033[0m");
    }
}
