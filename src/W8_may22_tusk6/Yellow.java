package W8_may22_tusk6;

public class Yellow extends Printer{

    public Yellow(String value) {
        super(value);
    }

    @Override
    public void print(String value){
        System.out.print("\033[33m");
        System.out.println(value);
        System.out.print("\033[0m");
    }
}
