import java.util.ArrayList;
import java.util.Random;

public class House {
    String num;
    ArrayList<Floor> floors = new ArrayList<>();

    public House(){
        int x = (new Random()).nextInt(1);
        if(x > 0){
            System.out.println((new Random()).nextInt(29)+1 + "/" + (new Random()).nextInt(1)+1);
        } else{
            System.out.println((new Random()).nextInt(29)+1);
        }
        byte z = 0;
        for (int i = 0; i < 10; i++) {
            floors.add(new Floor());
            floors.get(i).number = z;
            z++;
        }
    }
}
