package ekstraklasa;

public class Klasa2 {

    Klasa1 tralala = new Klasa1();

    int oblicz(){

        tralala.i++;
        Klasa1.si++;
        Klasa1.b++;

        tralala.suma();
        Klasa1.suma1();

        return Klasa1.b;
    }
}
