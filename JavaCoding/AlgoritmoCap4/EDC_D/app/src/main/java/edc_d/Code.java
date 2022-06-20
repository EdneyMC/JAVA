package edc_d;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {

        try (Scanner dado = new Scanner(System.in)){
            
            float n1,n2,n3,n4,ne,md1,md2;

            System.out.print("Digite a primeira nota do aluno: ");
            n1 = dado.nextFloat();
            System.out.print("Digite a primeira nota do aluno: ");
            n2 = dado.nextFloat();
            System.out.print("Digite a primeira nota do aluno: ");
            n3 = dado.nextFloat();
            System.out.print("Digite a primeira nota do aluno: ");
            n4 = dado.nextFloat();

            md1=(n1+n2+n3+n4)/4;

            if(md1>=7){
                System.out.println("\nAPROVADO");
                System.out.println("Nota média: " + md1);
            }else{
                System.out.println("\nNota média: " + md1 + "\n");
                System.out.println("Digite a nota de EXAME: ");
                ne = dado.nextFloat();
                md2=(md1+ne)/2;
                if (md2>=5){
                    System.out.println("\nAPROVADO EM EXAME");
                }else{
                    System.out.println("\nREPROVADO");
                }
                System.out.println("Nota média após EXAME: " + md2 + "\n");
            }

            System.exit(0);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
