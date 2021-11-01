package Receiver;

public class TV {
    private String description;
    private String channel;
    private int volume;

    public TV(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " On");
    }
    public void off() {
        System.out.println(description + " Off");
    }
    public void setInputChannel() {
        System.out.println(description + " Setting Channel");
    }
    public void setVolume() {
        System.out.println(description + " Setting Volume");
    }

}
