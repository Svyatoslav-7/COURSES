package W8_may22_tusk6;

public class Red extends Printer{
    public Red(String value) {
        super(value);
    }

    @Override
    public void print(String value){
        System.out.print("\033[31m");
        System.out.println(value);
        System.out.print("\033[0m");
    }
}
