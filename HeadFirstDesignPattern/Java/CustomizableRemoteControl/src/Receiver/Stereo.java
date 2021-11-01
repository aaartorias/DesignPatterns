package Receiver;

public class Stereo {
    private int volume;
    private String dvd;
    private String description;

    public Stereo(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(description + " On");
    }
    public void off() {
        System.out.println(description + " Off");
    }
    public void setDvd() {
        System.out.println(description + " Setting Dvd");
    }
    public void setVolume() {
        System.out.println(description + " Setting Volume");
    }
    public void setRadio() {
        System.out.println(description + " Radio On");
    }
    public void ejectDvd() {
        System.out.println(description + " Eject Dvd");
    }

}
