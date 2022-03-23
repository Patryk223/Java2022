import java.util.Scanner;

public class zad3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Podaj słowo: ");
        String str = scanner.nextLine().replaceAll("\\s+", "").toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length() - i - 1)){
                count++;
            }
        }
        if(count == 0){
            System.out.print("Podane słowo jest palindromem");
        } else {
            System.out.print("Podane słowo nie jest palindromem");
        }

    }
}

