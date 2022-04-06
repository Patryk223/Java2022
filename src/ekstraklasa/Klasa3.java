package ekstraklasa;

public class Klasa3 {

    Klasa1 abc = new Klasa1();
    Klasa2 def = new Klasa2();

    int c = obliczonka();

    void wyswietl(){
        System.out.print(c);
    }

    int obliczonka(){

        Klasa1.si++;
        Klasa1.b++;
        abc.i++;
        Klasa1.suma1();
        def.oblicz();

        abc.suma();
        return Klasa1.si;
    }
}
