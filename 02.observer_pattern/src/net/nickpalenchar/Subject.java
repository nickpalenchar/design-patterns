package net.nickpalenchar;

/**
 * Created by nick on 11/24/16.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
