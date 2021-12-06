public class Main {
    final static int V_max = 10;

    final static int[] Wartosci = {6, 4, 5, 7, 10, 2};
    final static int[] V = {6, 2, 3, 2, 3, 1};


    public static void main(String[] args) {
        System.out.println(plecak(Wartosci.length-1, V_max));
    }

    public static int plecak(int index, int dostepnaV) {
        if (index == 0 && V[0] > dostepnaV) {

            return 0;
        }
        if (index == 0 && V[0] <= dostepnaV) {

            return Wartosci[0];
        }


        int wartoscPoprzednia=plecak(index-1,dostepnaV);


        if(index>0 && dostepnaV<V[index]){
            
           return wartoscPoprzednia;
        }

        int wartoscTeraznijszaiPoprzednia=plecak(index-1,dostepnaV-V[index-1])
                +Wartosci[index];

        if(wartoscTeraznijszaiPoprzednia> wartoscPoprzednia){
            return wartoscTeraznijszaiPoprzednia;
        }
        else{
            return wartoscPoprzednia;
        }


    }
}
