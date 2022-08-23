import java.util.Random;

public class Room {
    String roomType;
    String roomTypes[]={"Living room", "Bath", "Kitchen"};
    double area;

    public Room() {
        roomType = roomTypes[(new Random()).nextInt(2)];
        area = (new Random()).nextInt(10);
    }
}
