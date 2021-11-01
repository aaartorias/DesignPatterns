package PullModel;

public interface IObserver {
    void update(double temperature, double humidity, double pressure);

    void update(IPublisher publisher, Object args);
}
