import java.awt.font.FontRenderContext;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Street> streets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            streets.add(new Street());
        }

    }

    public void theElder(ArrayList<Street> s){
        Citizen citizen = new Citizen();
        citizen.age = 0;
            for(Street s1 : s){
                for (House h : s1.houses){
                    for(Floor f : h.floors) {
                        for (Apartment a : f.apartments) {
                            for (int i = 0; i < a.citizens.size(); i++) {
                                if (a.citizens.get(i).age > citizen.age){
                                    citizen = a.citizens.get(i);
                                }
                            }
                        }
                    }
                }
        }
    }
}
