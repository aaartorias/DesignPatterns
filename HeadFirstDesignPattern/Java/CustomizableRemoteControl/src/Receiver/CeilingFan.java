package Receiver;

public class CeilingFan {
    private String description;
    private final int OFF = 0;
    private final int LOW = 1;
    private final int MEDIUM = 2;
    private final int HIGH = 3;
    int state;
    public CeilingFan(String description) {
        this.description = description;
    }
    public void low() {
        state = LOW;
        System.out.println(description + " Low");
    }
    public void mid() {
        state = MEDIUM;
        System.out.println(description + " Mid ");
    }
    public void high() {
        state = HIGH;
        System.out.println(description + " High");
    }
    public void off() {
        state = OFF;
        System.out.println(description + " Stopped");
    }
    public int getState() {
        return state;
    }
}
