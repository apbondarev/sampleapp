package ru.apbondarev;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("started");
        for (long counter = 0L; ; counter++) {
            SampleApp app = new SampleApp();
            Thread.sleep(100);
            System.out.println(counter + " " + app.hello());
        }
    }
}
