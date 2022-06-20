package edc_d;

import java.util.Scanner;

public class Code {
  public static void main(String[] args) {
    
    try (Scanner dado = new Scanner(System.in)){

        float tempoMin, velMediaKmHora, tempoSeg, velMediaKmSeg, distPercorrida, consumoLitro;
        float KM_LITRO=12;
        
        System.out.println("\nCALCULO CONSUMO  DE COMBUSTIVEL POR VIAGEM");
        System.out.print("Insira o tempo de duração da viagem (minutos): ");
        tempoMin = dado.nextFloat();
        System.out.print("Insira a velocidade média realizada na viagem (km/h): ");
        velMediaKmHora = dado.nextFloat();

        tempoSeg=tempoMin*60;

        velMediaKmSeg=velMediaKmHora/3600;

        distPercorrida=tempoSeg*velMediaKmSeg;

        consumoLitro=distPercorrida/KM_LITRO;

        System.out.println("\nRESUMO DA VIAGEM");
        System.out.printf("Velocidade média: %.0f km/h.", velMediaKmHora);
        System.out.printf("\nTempo gasto: %.0f minuto(s).", tempoMin);
        System.out.printf("\nDistância percorrida: %.1f km.", distPercorrida);
        System.out.printf("\nQuantidade de combustível utilzada: %.1f litro(s).\n\n", consumoLitro);

    } catch (Exception e) {
        System.out.print(e);
    }
  }
}
