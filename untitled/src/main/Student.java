package main;
import java.util.Random;

public class Student {
    String nickName;
    float laziness;
    byte IQ;
    int exams;
    int marks[];

    static int studentAmount;
    Student() {
        nickName = "Super Mario";
        laziness = 0.5f;
        IQ = (byte) 100;
        exams = 4;
        marks = new int[exams];
        for (int i = 0; i < exams; i++) {
            marks[i] = 8;
        }
        studentAmount++;
    }

    Student(float laziness, byte iq) {
        nickName = "Goga";
        this.laziness = laziness;
        IQ = iq;
        exams = 5;
        marks = new int[exams];
        for (int i = 0; i < exams; i++) {
            marks[i] = 9;
        }
        studentAmount++;
    }

    Student(Student KtoTo) {
        nickName = KtoTo.nickName;
        laziness = KtoTo.laziness;
        IQ = KtoTo.IQ;
        exams = KtoTo.exams;
        marks = new int[exams];
        for (int i = 0; i < exams; i++) {
            marks[i] = KtoTo.marks[i];
        }
        studentAmount++;
    }

    void printStudent() {
        System.out.println("Student's name is " + this.nickName);
        System.out.println("Student's laziness is " + this.laziness);
        System.out.println("Student's IQ is " + this.IQ);
        System.out.println("Student had " + this.exams + " exams");
        for (int i = 0; i < exams; i++) {
            System.out.print(" " + marks[i]);
        }
    }
    void randomizer(){
        String slovari[]={"WikroGaming","Chupip","Dima10iq","Dqnik","AyTucT"};
        this.nickName=slovari[(new Random()).nextInt(slovari.length)];
        laziness=(new Random()).nextFloat();
        IQ=(byte)((new Random()).nextInt(47)+80);
        exams=(new Random()).nextInt(10);
        marks=new int[exams];
        for (int i = 0; i < exams; i++) {
            marks[i]=(new Random()).nextInt(11);
        }
    }
    int sumMarks(){
        int sum=0;
        for (int i = 0; i < exams; i++)
            sum+=marks[i];
        return sum;
    }

    double averageMark(){
        return (sumMarks()/exams);
    }

    int maxMark(){
        int result = 0;
        for (int i = 0; i < exams; i++) {
            if(marks[i] > result)
                result = marks[i];
        }
        return result;
    }
    int minMark(){
        int result = 10;
        for (int i = 0; i < exams; i++) {
            if(marks[i] < result)
                result = marks[i];
        }
        return result;
    }

    public byte getIQ() {
        return IQ;
    }

    public void setIQ(byte IQ) {
        if(IQ > 50)
            this.IQ = IQ;
    }

    public float getLaziness() {
        return laziness;
    }

    public void setLaziness(float laziness) {
        if(laziness > 0 && laziness < 1)
            this.laziness = laziness;
    }

    public int getExams() {
        return exams;
    }

    public void setExams(int exams) {
        if(exams >= 0 && exams < 15 && exams != this.exams) {
            this.exams = exams;
            int tmp[] = marks;
            marks = new int[exams];
            int min = (this.exams < exams)?(this.exams):(exams);
            for (int i = 0; i < min; i++) {
                marks[i] = tmp[i];
            }
        }
    }

    public int getMark(int id) {
        if(id >= 0 && id < exams)
            return marks[id];
        return -1;
    }

    public void setMark(int mark, int id) {
        if(id >= 0 && id < exams && mark <= 10 )
            marks[id] = mark;
    }
}