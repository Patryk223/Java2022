import java.util.Scanner;

public class zad1 {
    static public void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str;
        char someChar;
        int count = 0;

        System.out.print("Podaj słowo: ");
        str = scanner.next();
        someChar = str.charAt(str.length() - 1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == someChar) {
                count++;
            }
        }


        System.out.println("Liczba wystąpień: " + count);
    }
}
