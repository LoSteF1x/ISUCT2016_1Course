package observer;

/**
 * Created by UI on 08.11.2017.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}