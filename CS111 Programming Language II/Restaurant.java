
public class Restaurant implements Rateable {

    private String name;
    private int stars;

    public Restaurant(String name, int stars) {
        this.name = name;
        this.stars = stars;
    }

    @Override
    public void rate(int score) {
        if (score >= 0) {
            stars += score;
            if (stars >= 6) {
                System.out.println("Super restaurant!");
            }
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" + "name=" + name + ", stars=" + stars + '}' + "\n";
    }

}
