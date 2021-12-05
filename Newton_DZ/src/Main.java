public class Main {

    public static void main(String[] args) {
        int N=5;
        int K=3;
        System.out.println(Newton(N,K));
    }
        public static int Newton(int n,int k){

            if( k==0 || n==k) {
                return 1;
            }
            else
                return Newton(n - 1, k - 1) + Newton(n - 1, k);

        }

}
