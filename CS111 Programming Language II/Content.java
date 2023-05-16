
public class Content {

    private final int contId;
    private String contName;
    private Actor actor;

    public Content(int contId, String contName, Actor actor) {
        this.contId = contId;
        this.contName = contName;
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "Content{" + "contId=" + contId + ", contName=" + contName + ", actor=" + actor + '}';
    }

}
