public class Main {

    final static int liczbaParPoczatkowa = 1;
    final static int liczbaMies = 5;

    public static void main(String[] args) {
        System.out.println(wyliczKroliki(liczbaParPoczatkowa, liczbaMies));
    }

    public static int wyliczKroliki(int Lk, int numerMiesiaca) {
        if (Lk == 1 && numerMiesiaca == 1) {
            return Lk;
        }
        if (Lk == 1 && numerMiesiaca == 2) {

            return Lk ;

        } else
            return wyliczKroliki(Lk , numerMiesiaca-1) + wyliczKroliki(Lk , numerMiesiaca-2);
    }

}

