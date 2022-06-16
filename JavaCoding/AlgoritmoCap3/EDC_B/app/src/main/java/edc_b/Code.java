package edc_b;

import java.util.Scanner;

public class Code {
    
    public static void main(String[] args) {

        try (Scanner dado = new Scanner(System.in)){

            float celsius, fahrenheit;

            System.out.print("\nCONVERSÃO DE TEMPERATURA GRAUS FAHRENHEIT PARA GRAUS CELSIUS\n");
            System.out.print("\nInsira uma temperatura graus Fahrenheit: ");
            fahrenheit = dado.nextFloat();

            celsius=((fahrenheit-32)*5)/9;

            System.out.printf("\nA temperatura em graus Celsius é: %.1f°C.\n\n",celsius);

        } catch (Exception e){
            System.out.println(e);
        }   
    }
}
