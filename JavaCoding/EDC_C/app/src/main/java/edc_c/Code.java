package edc_c;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        try (Scanner dado = new Scanner(System.in)){
            
            Float n1, n2, n3, n4, md;

            System.out.println("Digite a primeira nota: ");
            n1 = dado.nextFloat();
            System.out.println("Digite a segunda nota: ");
            n2 = dado.nextFloat();
            System.out.println("Digite a terceira nota: ");
            n3 = dado.nextFloat();
            System.out.println("Digite a quarta nota: ");
            n4 = dado.nextFloat();

            md=(n1+n2+n3+n4)/4;

            if (md>=5){
                System.out.println("\nAPROVADO\n");
            }else{
                System.out.println("\nREPROVADO\n");
            }

            System.out.println("Nota média: " + md + "\n");

            //Elimina erro java util causado pela virgula:
            System.exit(0);

        }catch (Exception e) {
           
           System.out.print(e);
        }   
    }
}
