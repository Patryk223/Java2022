package pliki;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class zad1 {

    public static void main(String[] args) throws FileNotFoundException {

        int[] solution = new int[3];

        String filePath = "plik.txt";

        String content = null;
        try {
            content = readFile(filePath, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        int whitespaces = 0;
        int i = 0;
        do{
            char ch = content.charAt(i);
            if(ch == ' ' || ch == '\t' || ch == '\n'){
                whitespaces++;
            }
            i++;
        } while(i < content.length());

        String[] words = content.split("\\s+");

        solution[0] = (content.length() - 1);
        solution[1] = (whitespaces - 1);
        solution[2] = words.length;

        System.out.println("Liczba znaków w pliku: " + solution[0]);
        System.out.println("Liczba białych znaków w pliku: " + solution[1]);
        System.out.println("Liczba słów pliku: " + solution[2]);

        for(int j = 0; j < solution.length; j++) {
            System.out.print(solution[j]);
            System.out.print(' ');
        }
    }

    public static String readFile(String path, Charset encoding) throws IOException {
        return Files.readString(Paths.get(path), encoding);
    }
}
