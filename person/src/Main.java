public class Main {
    public static void main(String[] args) {
        Person party[] = new Person[10];
        for (int i = 0; i < party.length; i+=2) {
            party[i]= new Man();
            party[i+1]= new Woman();
        }
        for(Person p : party){
            p.print();
        }
        for (int i = 0; i < party.length; i++) {
            if(party[i] instanceof Woman){
                ((Woman)party[i]).makeUp();
            }
        }
        for (int i = 0; i < party.length; i++) {
            party[i].sayHi();
            party[i].birthday();
            party[i].sayHi();
        }
    }
}
