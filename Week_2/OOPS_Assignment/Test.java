package live;

import music.Playable;
import music.String.Veena;
import music.Wind.Saxophone;

public class Test {
    public static void main(String[] args) {

        // Part A
        Veena veena = new Veena();
        veena.play();

        // Part B
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // Part C
        Playable p;

        p = veena;
        p.play();

        p = saxophone;
        p.play();
    }
}
