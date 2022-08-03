package main;

public class Main {
    public static void main(String[] args) {
//        Student Dima;
//        Dima=new Student();
        Student Ilia=new Student(0.4f, (byte) 120);
        Student Klon=new Student(Ilia);
//        Dima.IQ=(byte)110;
//        Dima.printStudent();
//        Ilia.printStudent();
        Klon.randomizer();
        Klon.printStudent();



        Student klass[] = new Student[10];
        for (int i= 0; i < klass.length - 1; i+=3) {
            klass[i+1] = new Student((float)(i * 0.1), (byte)(100 + i));
            klass[i+2] = new Student(klass[i+1]);
            klass[i] = new Student();
        }
        klass[klass.length - 1] = Ilia;

        for (int i = 0; i  < klass.length; i++) {
            klass[i].printStudent();
        }
        Student DimaKloun = klass[0];
        for (int i = 1; i < klass.length; i++) {
            if(DimaKloun.averageMark() < klass[i].averageMark()){
                DimaKloun = klass[i];
            }
        }
        System.out.println("DimaKloun: ");
        System.out.println("Average mark: " + DimaKloun.averageMark());
        System.out.println("Students Amount: " + Student.studentAmount);
    }
}
