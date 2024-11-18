package controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double somaDasNotas = 0;
        double nota = 0;
        int numeroDeNotas = 0;

        do {
            nota = entrada.nextDouble();

            if(nota <= 10 && nota >= 0){
                somaDasNotas += nota;
                numeroDeNotas++;
            }
        }
        while (nota!= -2);

        entrada.close();
        System.out.printf("A média é %.2f", somaDasNotas / numeroDeNotas);
    }
}
