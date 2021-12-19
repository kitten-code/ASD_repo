
public class Main {

    public static void main(String[] args)  {
        final int[] M = {500, 200, 100, 50, 20, 10, 5, 2, 1}; // nominaly wyrazone w groszach
        int zl=13, gr=63, r, i = 0;

        /**/  int[] zliczaj = new int[M.length]; // zliczanie wydanych monet

        System.out.print("Reszta: ");


        r = zl * 100 + gr; // konwersja zdefiniowanej reszty na grosze


        while (r > 0) // dopoki reszta > 0 ...
        {
            if (r >= M[i]) // jesli reszta wieksza/rowna danemu nominalowi ...
            {
                System.out.print(M[i] / 100.0 + " "); // wypisz ten nominal


                /**/                zliczaj[i]++; // tablica zliczaj powielona


                r = r - M[i]; // i pomniejsz reszte o wydane monety
            }
            else
                i++;
        }

        System.out.println();
        /**/        System.out.println("Wydane monety:"
                + "nominal liczba monet");


        /**/        for(int j=0; j<M.length; j++)
            /**/            System.out.println(M[j]/100.0 + " " + zliczaj[j]);
    }
}
