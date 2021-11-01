package PushModel;

public interface IPublisher {
    void register(IObserver observer);
    void deregister(IObserver observer);
    void notifyObservers();
}
