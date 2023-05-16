
public class Serie extends Content {

    private int episode;

    public Serie(int episode, int contId, String contName, Actor actor) {
        super(contId, contName, actor);
        this.episode = episode;
    }

}
