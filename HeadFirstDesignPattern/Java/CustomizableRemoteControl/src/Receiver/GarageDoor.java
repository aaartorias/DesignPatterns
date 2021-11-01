package Receiver;

public class GarageDoor {
    private String description;
    public GarageDoor(String description) {
        this.description = description;
    }
    public void up() {
        System.out.println(description + " Up");
    }
    public void down() {
        System.out.println(description + " Down");
    }
    public void stop() {
        System.out.println(description + " Stopped");
    }
    public void LightOn() {
        System.out.println(description + " Light On");
    }
    public void LightOff() {
        System.out.println(description + " Light Off ");
    }
}
