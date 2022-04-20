package pliki;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class zad2 {

    public static void main(String[] args) throws FileNotFoundException {

        String wejsciowy = null;
        String wyjsciowy = null;

        Scanner scanner = new Scanner(new File("wejsciowy.txt"), String.valueOf(StandardCharsets.UTF_8));
        wejsciowy = scanner.useDelimiter("\\A").next();
        System.out.println("Plik wejściowy:");
        System.out.println(wejsciowy);

        readText("wejsciowy.txt", "wyjsciowy.txt", "egzamin");

        scanner = new Scanner(new File("wyjsciowy.txt"), String.valueOf(StandardCharsets.UTF_8));
        wyjsciowy = scanner.useDelimiter("\\A").next();
        System.out.println("\nPlik wyjściowy:");
        System.out.println(wyjsciowy);
    }
    public static void readText(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws FileNotFoundException {
        Scanner scan = new Scanner(new File(nazwaPlikWe));
        PrintWriter zapis = new PrintWriter(nazwaPlikWy);
        int licznik = 1;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            if(line.contains(slowo)) {
                zapis.println(licznik + ": " +line);
            }
            licznik++;
        }
        zapis.close();
    }

}
