import java.util.Scanner;

public class zad2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        System.out.print("Podaj słowo: ");
        String str = scanner.next();
        sb.append(str);
        sb.reverse();
        System.out.println("Odwrócony napis: " + sb);
    }
}

