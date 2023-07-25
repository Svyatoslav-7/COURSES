package W11_june10_tusk2;

public class Worker {
    String name;
    String secondName;
    String nameOfWork;
    int ageStartOfWork;

    public Worker(String name, String secondName, String nameOfWork, int ageStartOfWork) {
        this.name = name;
        this.secondName = secondName;
        this.nameOfWork = nameOfWork;
        this.ageStartOfWork = ageStartOfWork;
    }

    public int getExperience() {
        return 2023 - ageStartOfWork;
    }

    public String getLastName() {
        return secondName;
    }
}
