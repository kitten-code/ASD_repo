public class Main {

    final static int iloscBakteri=1;
    final static int tura=8;
    public static void main(String[] args) {
        System.out.println(podzial(iloscBakteri,tura));
    }
    public static int podzial( int ilosc, int numerTury){
        if( ilosc == 1 && numerTury == 1 ){
            return ilosc*2;
        }
        else{
            return podzial(ilosc, numerTury-1)*2;

        }

    }


}
