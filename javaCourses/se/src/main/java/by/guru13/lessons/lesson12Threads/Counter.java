package by.guru13.lessons.lesson12Threads;

/**
 * Created by ASUS on 22.07.2015.
 */
public class Counter {
    private int amount;

    public synchronized int increase(){
        amount++;
        return amount;
    }
}
