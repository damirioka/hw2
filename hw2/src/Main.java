import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int number between 1 and 5:");
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case default:
                System.out.println("Error");
        }
        System.out.println("Enter an int number (x):");
        int x = scanner.nextInt();
        System.out.println("Enter an int number (y):");
        int y = scanner.nextInt();
        method(x,y);
    }
    static void method(int a, int b){
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
}
