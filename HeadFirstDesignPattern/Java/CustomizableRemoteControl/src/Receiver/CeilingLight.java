package Receiver;

public class CeilingLight {
    private String description;
    public CeilingLight(String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + "Light: On");
    }
    public void off() {
        System.out.println(description + "Light: Off");
    }
}
