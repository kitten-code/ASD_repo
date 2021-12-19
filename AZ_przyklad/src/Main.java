

public class Main {

    public static void main(String[] args) {


        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // nominaly wyrazone w groszach
        int zl=20, gr=20, r, i = 0; // wariant bez wprowadzania tekstu


        System.out.print("Reszta to: ");
        r = zl * 100 + gr; // konwersja zdefiniowanej reszty na grosze

        while (r > 0) // dopoki reszta > 0 ...
        {
            if (r >= M[i]) // jesli reszta wieksza/rowna danemu nominalowi ...
            {
                System.out.print(M[i] / 100.0 + " "); // wypisz ten nominal
                r = r - M[i]; // i pomniejsz reszte o wydane monety
            }
            else
            {
                i++; // w przeciwnym przypadku przejdz do kolejnego nominalu
            }
        }
        System.out.println();
    }

}
