public class Main {

    public static void main(String[] args) {
        final int N = 8;
        System.out.println(wylicz(N));
    }

    static int wylicz(int n) {
        if (n == 1 || n == 2 || n == 3) {
            return 1;
        } else {
            return (wylicz(n - 1) + wylicz(n - 2) + wylicz(n - 3)) * 2;
        }
    }
}
