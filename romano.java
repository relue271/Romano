
import java.util.Scanner;

class romano{
    private static int in;
    private static int numAlfa;

    public static void main(String args[]){

        do {
            System.out.print("Entrada (1 a 4999): "); //Arabico
            Scanner in = new Scanner( System.in );
            int numAlfa = in.nextInt();

            //System.out.println( in );
            System.out.println( numAlfa );
        } while ( numAlfa > 4999 );

        
        
        int unidade = numAlfa % 10;
        int dezena = numAlfa % 100;
        int centena = numAlfa % 1000;
        int milhar = numAlfa % 10000;
        System.out.println(unidade);
        System.out.println(dezena);
        System.out.println(centena);
        System.out.println(milhar);


        System.out.println();
        System.out.print("saida: "); // Romano



        //String[] StrArrayNumRomano = new String[20];
        
        
        // unidade
        /*
        if (resto == 1) { StrArrayNumRomano[k] = "I"; }
        if (resto == 2) { StrArrayNumRomano[k] = "II"; }
        if (resto == 3) { StrArrayNumRomano[k] = "III"; }
        if (resto == 4) { StrArrayNumRomano[k] = "IV"; }
        if (resto == 5) { StrArrayNumRomano[k] = "V"; }
        if (resto == 6) { StrArrayNumRomano[k] = "VI"; }
        if (resto == 7) { StrArrayNumRomano[k] = "VII"; }
        if (resto == 8) { StrArrayNumRomano[k] = "VIII"; }
        if (resto == 9) { StrArrayNumRomano[k] = "IX"; }
        System.out.print(" " + StrArrayNumRomano[k]);
        */


        // dezena



        // centena


        // milhar


    }
}
