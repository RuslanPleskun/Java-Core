package src.hw13;

import java.io.Serializable;

public class CarComponent implements Runnable, Serializable {
    private String name;
    private int time;

    public CarComponent(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is being built...");
            Thread.sleep(time * 1000L);
            System.out.println(name + " is ready!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
