package dziedziczenie;

public class KolorowyPunkt extends Punkt{

    private String kolor;

    //Getter
    public String getKolor() {

        return kolor;
    }

    //Setter
    public void setKolor(String kolor) {

        this.kolor = kolor;
    }

    public static void main(String args[]){

        Punkt punkt = new Punkt();
    }
}
