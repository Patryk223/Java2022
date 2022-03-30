import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class zad5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrlist = new ArrayList<Integer>();
        arrlist.add(0);
        int a = 0;
        for(int i = 0; i < 4; i++){

            System.out.print("Podaj cyfre: ");
            a = scanner.nextInt();
            if(a < 0 || a > 9){
                System.out.print("Niepoprawne dane");
                System.exit(0);
            }
            arrlist.add(a);
        }

        Collections.sort(arrlist);

        if(arrlist.get(1) > 2 || arrlist.get(2) > 5 || (arrlist.get(1) == 2 && (arrlist.get(2) > 3 || arrlist.get(3) > 5))){
            System.out.print("Niepoprawne dane");
            System.exit(0);
        }

        System.out.print("Twoja godzina: " + hour(arrlist));
    }

    public static String hour(ArrayList<Integer> arrlist){

        String Hour = "";
        if(arrlist.contains(2) && (!arrlist.contains(1) || arrlist.get(3) < 6)) {
            Hour = Hour + arrlist.get(arrlist.indexOf(2));
            arrlist.remove(arrlist.indexOf(2));
            for (int i = 3; i >= 1; i--) {
                if(arrlist.get(i) < 4){
                    Hour = Hour + arrlist.get(i);
                    arrlist.remove(i);
                    break;
                }
            }
            Hour = Hour + ":";
            for (int i = 2; i >= 1; i--) {
                if(arrlist.get(i) < 6){
                    Hour = Hour + arrlist.get(i);
                    arrlist.remove(i);
                    break;
                }
            }
            Hour = Hour + arrlist.get(1);

        } else {

            Hour = Hour + arrlist.get(1);
            arrlist.remove(1);
            for (int i = 3; i >= 1; i--) {
                if(arrlist.get(i) < 10){
                    Hour = Hour + arrlist.get(i);
                    arrlist.remove(i);
                    break;
                }
            }
            Hour = Hour + ":";
            for (int i = 2; i >= 1; i--) {
                if(arrlist.get(i) < 6){
                    Hour = Hour + arrlist.get(i);
                    arrlist.remove(i);
                    break;
                }
            }
            Hour = Hour + arrlist.get(1);
        }

        return Hour;
    }
}

