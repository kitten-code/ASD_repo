public class Main {
   
        private static int MaxDni = 200;
        private static int MaxPopulacja = 100000;
        private static int PoczatkowaLiczbaZarazonych = 10;
        private static int ozdrowiency = 0;

        public static void main(String[] args)
        {
            int[] dni = new int[MaxDni]; // tablica po to, aby zapisywac wartosci z dni wczesniejszych

            for (int dzien = 0; dzien < MaxDni - 1; dzien++)
            {
                if (ozdrowiency >= MaxPopulacja)
                {
                    System.out.println("Wyzdrowiano w: " + (dzien - 1));// dzien mniej poniewaz nie jestem w stanie wypisac dla aktualnego bo go nie ma
                    break; // calkowicie zakancza petle for i wychodzi z niej
                }

                if (dzien == 0) // jesli to pierwszy dzien to ustawiamy poczatkowa liczbe zarazonych
                {
                    dni[dzien] = PoczatkowaLiczbaZarazonych;
                    continue; // po wykonaniu tego if'a continue zmusza do przejscia do nastepnej iteracji petli ignorujac
                    // kolejne ify, po prostu iteruje do nastepnej
                }

                if (dni[dzien - 1] >= MaxPopulacja) // jesli w poprzednim dniu bylo wiecej lub tyle samo zarazonych to juz nie ma osob do zarazenia
                {                                   // wiec wszyscy zdrowieja
                    dni[dzien] -= ozdrowiency;
                    continue;
                }

                if (dzien >= 7) // jesli jest wiecej niz 7 dni epidemi to codziennie zaczynaja zdrowiec osoby ktore byly
                {               // chore 7 dni wczesniej
                    ozdrowiency += dni[dzien - 7];
                    dni[dzien] = (dni[dzien - 1] - ozdrowiency) * 2;
                    continue;
                }

                dni[dzien] = dni[dzien - 1] * 2; // jesli zadne z powyzszych to po prostu jest dwukrotnie wiecej zarazonych
            }
        }
    }
