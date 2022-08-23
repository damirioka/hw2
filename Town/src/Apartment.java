import java.util.ArrayList;
import java.util.Random;

public class Apartment {
    int number;
    ArrayList<Citizen> citizens = new ArrayList<>();
    ArrayList<Room> rooms = new ArrayList<>();

    public Apartment() {
        number = (new Random()).nextInt(30)+1;
        for (int i = 0; i < (new Random()).nextInt(4)+4; i++) {
            citizens.add(new Citizen());
        }
        for (int i = 0; i < (new Random()).nextInt(2)+2; i++) {
            rooms.add(new Room());
        }
    }
}
