import java.util.Random;

public class Man extends Person{
    double money;

    Man(){
        super();
        money = new Random().nextDouble(83724848);
    }

    Man(String x, int y, double z){
        super(x,y);
        money = z;
    }
    void print(){
        super.print();
        System.out.println(money);
    }

    @Override
    void sayHi() {
        if(money > 8372){
            System.out.println("uraaaaa");
            System.out.println("");
        }else{
            System.out.println("beeeee");
            System.out.println("");
        }

    }

    void spendMoney(){
        money = 0;
    }

    public void birthday(){
        super.birthday();
        money=0;
    }
}
