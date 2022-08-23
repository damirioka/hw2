import java.util.ArrayList;
import java.util.Random;

public class Floor {
    byte number;
    ArrayList<Apartment> apartments = new ArrayList<>();

    public Floor(){
        for (int i = 0; i < (new Random()).nextInt(3)+1; i++) {
            apartments.add(new Apartment());
        }
    }
}
