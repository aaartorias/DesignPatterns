public class DvdPlayer {
    private String movie;
    private Amplifier amplifier;

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped " + getMovie());
    }

    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    public void playMovie(String movie) {
        setMovie(movie);
        System.out.println("Top-O-Line DVD Player playing " + getMovie());
    }
}
