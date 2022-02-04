
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
        
        

        // dezena



        // centena


        // milhar


    }
}
