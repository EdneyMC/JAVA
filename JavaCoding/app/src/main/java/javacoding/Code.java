package javacoding;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        try (Scanner dado = new Scanner(System.in)) {
            Integer a, b, result;

            System.out.println("Insira o primeiro número: ");
            a = dado.nextInt();
            System.out.println("Insira o segundo número: ");
            b = dado.nextInt();

            result = (a>b) ? a-b : b-a;

            // if (a>b){
            //     result = a - b;
            // }else{
            //     result = b - a;
            // }
        
            System.out.println("\nA diferença do número maior para o menor é: " + result + "\n");
            
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}