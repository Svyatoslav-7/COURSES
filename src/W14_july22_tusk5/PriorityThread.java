package W14_july22_tusk5;

class PriorityThread extends Thread {
    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(getName() + " is running. Value: " + i);
        }
    }
}

