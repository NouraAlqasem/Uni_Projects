
public class Movie extends Content implements Rateable {

    private int duration;
    private int hearts;

    public Movie(int duration, int hearts, int contId, String contName, Actor actor) {
        super(contId, contName, actor);
        this.duration = duration;
        rate(hearts);
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int d) {
        duration = d;
    }

    @Override
    public void rate(int score) {
        if (score >= 0) {
            hearts += score;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", duration=" + duration + ", hearts=" + hearts + '}' + "\n";
    }

}
