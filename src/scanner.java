import java.util.Scanner;

public class scanner {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        double d;

        System.out.print("Podaj wartość a: ");
        a = scanner.nextInt();
        System.out.print("Podaj wartość b: ");
        d = scanner.nextDouble();

        System.out.println("a = " + a + " \td = " + d);
    }
}
