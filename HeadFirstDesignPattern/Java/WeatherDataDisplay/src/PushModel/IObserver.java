package PushModel;

public interface IObserver {
    void update(double temperature, double humidity, double pressure);
}
