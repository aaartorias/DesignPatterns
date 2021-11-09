public class HomeTheatreTestRun {
    public static void main(String[] args) {
        // Instantiate components here
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer();
        CdPlayer cd = new CdPlayer();
        Projector projector  = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, tuner, dvd, cd, projector, lights, screen, popper);
        homeTheater.watchMovie("Raiders of the lost Ark");
        homeTheater.endMovie();
    }

}
