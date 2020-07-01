public class Movie {

    private String title;
    private String mainActor;
    private Double mainRate;
    private int pgRate;
    private String genre;

    public Movie(String title, String mainActor, Double mainRate, int pgRate, String genre) {
        this.title = title;
        this.mainActor = mainActor;
        this.mainRate = mainRate;
        this.pgRate = pgRate;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainActor() {
        return mainActor;
    }

    public void setMainActor(String mainActor) {
        this.mainActor = mainActor;
    }

    public Double getMainRate() {
        return mainRate;
    }

    public void setMainRate(Double mainRate) {
        this.mainRate = mainRate;
    }

    public int getPgRate() {
        return pgRate;
    }

    public void setPgRate(int pgRate) {
        this.pgRate = pgRate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
