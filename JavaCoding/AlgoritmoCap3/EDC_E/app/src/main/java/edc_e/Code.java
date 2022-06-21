package edc_e;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        
        try (Scanner dado = new Scanner(System.in)){
            
            float valorOrigBoleto, taxaJurosSimples, boletoAtualizado;
            int tempoAtraso;

            System.out.println("\nCALCULO DE JUROS SIMPLES DE PRESTAÇOES EM ATRASO");
            System.out.print("Insira o valor original da prestação em atraso: ");
            valorOrigBoleto=dado.nextFloat();
            System.out.print("Insira o total de dias corridos, desde um dia após o vencimento da parcela até a data atual: ");
            tempoAtraso=dado.nextInt();
            System.out.print("Insira a taxa de juros ao dia, informada no campo observações do boleto: ");
            taxaJurosSimples=dado.nextFloat();
            
            boletoAtualizado=valorOrigBoleto + (valorOrigBoleto * (taxaJurosSimples/100) * tempoAtraso);

            System.out.printf("\nO valor atualizado da parcela para pagamento hoje é: %.2f\n\n", boletoAtualizado);

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
