
public class Actor {

    private String actName;

    public Actor(String actName) {
        this.actName = actName;
    }

    @Override
    public String toString() {
        return "Actor{" + "actName=" + actName + '}' + "\n";
    }

}
