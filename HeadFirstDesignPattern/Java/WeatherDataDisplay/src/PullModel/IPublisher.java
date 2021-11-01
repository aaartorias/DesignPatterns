package PullModel;

public interface IPublisher {
    void register(IObserver observer);
    void deregister(IObserver observer);
    void notifyObservers();
    void setChanged();
    public void notifyObservers(Object args);
}
