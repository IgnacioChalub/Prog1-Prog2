package austral.prog1.tp1;

public class Tp1IgnacioChalubChange {

    public static void main(String[] args) {
        float p; //pago
        float g; // gasto

        p=100f;
        g=74.5f;

        System.out.println( "Dinero ingresado:" + p );
        System.out.println( "Gasto:" + g );

        float u;

        u= g;

        g= (int) g;

        g= p - g;

        u= p - ( g + --u);


        System.out.println( "Vuelto" );

        System.out.println( "Pesos:" + --g );

        System.out.println( "Centavos:" + u*100 );

    }


}
