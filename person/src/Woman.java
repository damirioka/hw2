import java.util.Random;

public class Woman extends Person{
    float beauty;
    byte beachness;

    Woman(){
        beauty = 10;
        beachness = (byte)((new Random()).nextInt(126)+1);
    }

    Woman(String n, int a, float b, byte b1){
        name = n;
        age = a;
        beauty = b;
        beachness = b1;
    }

    void print(){
        super.print();
        System.out.println(beauty);
        System.out.println(beachness);
    }

    @Override
    void sayHi() {
        if(beachness < 100){
            System.out.println("love");
            System.out.println("");
        }else {
            System.out.println("bue");
            System.out.println("");
        }
    }

    void makeUp(){
        beauty *= 2;
    }

    @Override
    public void birthday() {
        super.birthday();
        beauty-= 30;
        beachness=(byte) 127;

    }
}