public class Amplifier {
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private Tuner tuner;

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Top-O-Line Amplifier DVD player to Top-O-Line DVD  player");
        this.dvdPlayer = dvdPlayer;
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }
}
