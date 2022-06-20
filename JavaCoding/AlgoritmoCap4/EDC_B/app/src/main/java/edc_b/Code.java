package edc_b;

import java.util.Scanner;

public class Code {

    public static void main(String[] args) {

        try (Scanner dado = new Scanner(System.in)) {
            int n;

            System.out.print("\nDigite um valor inteiro: ");
            n = dado.nextInt();

            n = (n<0) ? n*-1 : n;

            System.out.println("\nValor: " + n + "\n");
            
        } catch (Exception e) {
                System.out.print(e);
        }

    }
}