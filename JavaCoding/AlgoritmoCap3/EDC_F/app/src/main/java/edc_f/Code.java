package edc_f;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        try (Scanner dado = new Scanner(System.in)){

            float a, b, apoioTrocaValor;

            System.out.println("\nTROCA DE VALORES");
            System.out.print("Insira um valor para A: ");
            a = dado.nextFloat();
            System.out.print("Insira outro valor para B: ");
            b = dado.nextFloat();
            System.out.println("\nVALORES INSERIDOS:");
            System.out.printf("A = %.2f", a);
            System.out.printf("\nB = %.2f", b);

            apoioTrocaValor=a;
            a=b;
            b=apoioTrocaValor;

            System.out.println("\n\nVALORES SUBSTITUIDOS:");
            System.out.printf("A = %.2f", a);
            System.out.printf("\nB = %.2f\n\n", b);
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
