package src.hw13;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.Semaphore;

public class Car implements Serializable {
    public static void main(String[] args) {
        Semaphore assemblyLine = new Semaphore(3);

        Thread tireThread = new Thread(new CarComponent("Tire", 2));
        Thread seatsThread = new Thread(new CarComponent("Seats", 3));
        Thread engineThread = new Thread(new CarComponent("Engine", 7));
        Thread frameThread = new Thread(new CarComponent("Frame", 5));

        try {
            assemblyLine.acquire();
            tireThread.start();
            assemblyLine.acquire();
            seatsThread.start();
            assemblyLine.acquire();
            engineThread.start();
            frameThread.start();

            tireThread.join();
            seatsThread.join();
            engineThread.join();
            frameThread.join();

            Car car = new Car();
            saveCarToFile(car);

            System.out.println("Car is assembled and saved to car.ser");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            assemblyLine.release(3);
        }
    }

    private static void saveCarToFile(Car car) {
        try (FileOutputStream fileOut = new FileOutputStream("car.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(car);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
