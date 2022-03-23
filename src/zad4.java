import java.util.Scanner;

public class zad4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.print("Podaj słowo: ");
        String str = scanner.nextLine();
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Character.getNumericValue(str.charAt(i));
            }
        }
        System.out.println("Wynik: " + sum);

    }
}

