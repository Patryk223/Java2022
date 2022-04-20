package pliki;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class zad0 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ala.txt");

        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();

        Scanner in = new Scanner(file);
        String zdanie = in.nextLine();
        System.out.println(zdanie);
    }

}
