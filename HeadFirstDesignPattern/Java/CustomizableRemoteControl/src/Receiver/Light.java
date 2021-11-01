package Receiver;

public class Light {
    private String description;
    public Light (String description) {
        this.description = description;
    }
    public void on() {
        System.out.println(description + "On ");
    }
    public void off() {
        System.out.println(description + " Off ");
    }
}
