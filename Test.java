
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Serie s1 = new Serie(41, 7132, "The Crown", new Actor("John Lithgow"));
        Serie s2 = new Serie(137, 7195, "Blackish", new Actor("Yara Shahidi"));

        Movie m1 = new Movie(2, 5, 8934, "La La Land", new Actor("Emma Stone"));
        Movie m2 = new Movie(2, -3, 8911, "Julie and Julia", new Actor("Amy Adams"));

        Restaurant restaurant = new Restaurant("Nobu", 5);
        Content[] arr = new Content[4];

        try {

            arr[0] = s1;
            arr[1] = s2;
            arr[2] = m1;
            arr[3] = m2;

            ArrayList<Rateable> list = new ArrayList();
            list.add(restaurant);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] instanceof Movie) {
                    Movie m = (Movie) arr[i];
                    m.setDuration(m.getDuration() + 1);
                    list.add(m);
                }
            }

            for (Rateable r : list) {
                r.rate(1);
            }
            System.out.println(list.toString());

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Error: Array Index Out Of Bounds Exception !");
        }
    }
}
