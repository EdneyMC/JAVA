package edc_a;

import java.util.Scanner;

public class Code {

    public static void main(String[] args) {
        
        try (Scanner dado = new Scanner(System.in)){

            float celsius, fahrenheit;

            System.out.print("Insira uma temperatura em graus Celsius: ");
            celsius = dado.nextFloat();

            fahrenheit = (9*celsius+160)/5;

            System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit + "°F");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}