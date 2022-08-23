import java.util.Random;

public class Citizen {
    int age;
    String name;
    boolean sex;

    public Citizen() {
        age = (new Random()).nextInt(110);
        name = "Smth";
        int x = (new Random()).nextInt(1);
        if(x<1){
            sex = true;
        } else{
            sex = false;
        }
    }
}
