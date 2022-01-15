

import java.util.Scanner;

class romano{
    public static void main(String args[]){
        //System.out.println("Hello Roman");


        System.out.print("Entrada: ");
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        //System.out.print(entrada)
;
        System.out.println();
        System.out.print("saida: ");
        /*
        I - 1
        V - 5
        X - 10
        C - 100
        M - 1000
        */
        
        String [] array = entrada.split("");
        for (int k=0; k < entrada.length(); k++){
            if (array[k].equals("1")) {
                array[k] = "I";
            } 
            System.out.print(array[k]);
        }


    }
}


