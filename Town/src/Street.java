import java.util.ArrayList;
import java.util.Random;

public class Street {
    String nameStreet;
    String[] nameStreets = {"Vasile Lupu", "Ștefan cel Mare", "Ciocani"};
    ArrayList<House> houses = new ArrayList<>();

    public Street(){
        nameStreet = nameStreets[(new Random()).nextInt(2)];
        for (int i = 0; i <  (new Random()).nextInt(10)+1; i++) {
            houses.add(new House());
        }
    }
}
