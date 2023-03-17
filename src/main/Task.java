package main;

public class Task {
    int metodas() throws InterruptedException {
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += i;
        }
        synchronized (this) {
            wait();
        }

        System.out.println("Suma suskaiciuota");
        return suma;
    }
}
