package edc_c;

import java.util.Scanner;

public class Code {

    public static float calcPotencia(float rTamBase, int e){
        if (e==0){
            return 1;
        } else {
            return rTamBase * calcPotencia(rTamBase, e-1);
        }
    }

    public static void main(String[] args) {
        
        try (Scanner dado = new Scanner(System.in)){

            float rTamBase, hTamAltura, volumeCm3, volumeMt3, volumeLt;
            double PI = 3.14159;
            float pi = (float)PI;
            int e=2;

            System.out.print("\nCALCULO DE AREA DE CILINDRO E CONVERSÃO EM LITROS");
            System.out.print("\nInsira em centímetros (cm), o tamanho do raio da base do cilindro (Dica: raio=diametro da base / 2): ");
            rTamBase = dado.nextFloat();
            System.out.print("\nInsira em centímetros (cm), o tamanho da altura do cilindro: ");
            hTamAltura = dado.nextFloat();

            volumeCm3 = pi * calcPotencia(rTamBase, e) * hTamAltura;

            volumeMt3 = volumeCm3 / 1000000;

            volumeLt = volumeMt3 * 1000;

           System.out.printf("\nO volume total do cilindro em centimetros cubicos eh: %.4f cm3\n", volumeCm3);
            System.out.printf("\nO volume total do cilindro em metros cubicos eh: %.8f mt3\n", volumeMt3);
            System.out.printf("\nO volume total do cilindro em litros eh: %.3f lt(s)\n\n", volumeLt);

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
