package W9_may27_tusk5;

public class ConverterTemperature {
    double temperature;

    public ConverterTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void convert(double temperature, String whatHave, String whatWant){      //K C F
        if(whatHave.equals("K")){
            if(whatWant.equals("C")){
                double C=temperature-273.15;
                System.out.println("C= "+C);
            }else if(whatWant.equals("F")){
                double F=((temperature-273.15)*9/5)+32;
                System.out.println("F= "+F);
            }
        }else if(whatHave.equals("C")){
            if(whatWant.equals("K")){
                double K=temperature+273.15;
                System.out.println("K= "+K);
            }else if(whatWant.equals("F")){
                double F=(temperature*9/5)+32;
                System.out.println("F= "+F);
            }
        }else if(whatHave.equals("F")){
            if(whatWant.equals("C")){
                double C=(temperature-32)*5/9;
                System.out.println("C= "+C);
            }else if(whatWant.equals("K")){
                double K=(temperature+459.67)*5/9;
                System.out.println("K= "+K);
            }
        }
    }
}
