public class Main {

    public static void main(String[] args) {
        final int N=6;
        System.out.println(fibo(N));

    }
    public static int fibo ( int n) {
        int[] tab = new int[n+1];// aby tablica rozpoczynała się od 1
        tab[1]=1;
        tab[2]=1;
        for(int i=3;i<tab.length;i++) {
            // czyli wykonuj pętlę zwiększając i( zaczynając od 3 miejcas bo to inna liczba niz 1)
            //do momentu az i bedzie nie wieksze niz dlugosc tablicy w naszym przypadku N=5
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[tab.length - 1]; // zwroc element tablicy który jest równy długości tablicy -1
    }
}
