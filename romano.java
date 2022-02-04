
import java.util.Scanner;

class romano{
    static int numAlfa;


    public static void main(String args[]){

        
        System.out.print("Entrada (1 a 3999): "); //Arabico
        Scanner in = new Scanner( System.in );
        int numAlfa = in.nextInt();


        int milhar, centena, dezena, unidade;
        milhar = (numAlfa/1000) * 1000;
        centena = ((numAlfa/100) % 10) * 100;
        dezena = ((numAlfa/10) % 10) * 10;
        unidade = ((numAlfa/1)% 10) * 1;



        // milhar
        if (milhar == 1000) { System.out.print("M"); }
        else if (milhar == 2000) { System.out.print("MM"); }
        else if (milhar == 3000) { System.out.print("MMM"); }

        // centena
        if (centena == 100) { System.out.print("C"); }
        else if (centena == 200) { System.out.print("CC"); }
        else if (centena == 300) { System.out.print("CCC"); }
        else if (centena == 400) { System.out.print("CD"); }
        else if (centena == 500) { System.out.print("D"); }
        else if (centena == 600) { System.out.print("DC"); }
        else if (centena == 700) { System.out.print("DCC"); }
        else if (centena == 800) { System.out.print("DCCC"); }
        else if (centena == 900) { System.out.print("CM"); }
        
        // dezena
        if (dezena == 10) { System.out.print("X"); }
        else if (dezena == 20) { System.out.print("XX"); }
        else if (dezena == 30) { System.out.print("XXX"); }
        else if (dezena == 40) { System.out.print("XL"); }
        else if (dezena == 50) { System.out.print("L"); }
        else if (dezena == 60) { System.out.print("LX"); }
        else if (dezena == 70) { System.out.print("LXX"); }
        else if (dezena == 80) { System.out.print("LXXX"); }
        else if (dezena == 90) { System.out.print("XC"); }

        // unidade
        if (unidade == 1) { System.out.print("I"); }
        else if (unidade == 2) { System.out.print("II"); }
        else if (unidade == 3) { System.out.print("III"); }
        else if (unidade == 4) { System.out.print("IV"); }
        else if (unidade == 5) { System.out.print("V"); }
        else if (unidade == 6) { System.out.print("VI"); }
        else if (unidade == 7) { System.out.print("VII"); }
        else if (unidade == 8) { System.out.print("VIII"); }
        else if (unidade == 9) { System.out.print("IX"); }

    }
}
