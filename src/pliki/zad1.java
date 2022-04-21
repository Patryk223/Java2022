package pliki;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class zad1 {

    public static void main(String[] args) throws FileNotFoundException {

        int[] solution = new int[3];
        int whitespaces = 0;
        int i = 0;
        int word = 0;

        String content = null;
        Scanner scanner = new Scanner(new File("plik.txt"), String.valueOf(StandardCharsets.UTF_8));
        content = scanner.useDelimiter("\\A").next();
        System.out.println("Zawartość pliku:");
        System.out.println(content);

        do{
            char ch = content.charAt(i);
            if(ch == ' ' || ch == '\t' || ch == '\n'){
                whitespaces++;
            }
            i++;
        } while(i < content.length());

        String[] words = content.split("\\s+");

        for(int l = 0; l < words.length; l++) {
            if(!words[l].matches(".*[0-9].*")) {
                word++;
            }
        }

        solution[0] = (content.length() - 1);
        solution[1] = (whitespaces - 1);
        solution[2] = word;

        System.out.println("\nLiczba znaków w pliku: " + solution[0]);
        System.out.println("Liczba białych znaków w pliku: " + solution[1]);
        System.out.println("Liczba słów pliku: " + solution[2]);

        for(int j = 0; j < solution.length; j++) {
            System.out.print(solution[j]);
            System.out.print(' ');
        }
    }
}
