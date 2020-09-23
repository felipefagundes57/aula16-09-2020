import java.util.Scanner;
// - Receber do usuário e analisar km percorridos e l de combustivel para cada viagem de carro.
public class Quilometragem {
	public static void main(String[] args) {
		// - Inicializar variáveis
		// - inicializar km totais com 0
		int kmTotal = 0;
		// - inicializar l totais com 0
		int lTotal = 0;
		// - inicializar contador de viagem com 1
		int viagens = 1;
		// Inicializar a leitura de dados
		Scanner entrada = new Scanner(System.in);
		
		// - Pedir para o usuário os km percorridos e os l de combustível gastos
		// - imprimir os dados de km total, l total e média de consumo por viagem
		// - faça 
		do {
		//	- informe ao usuário o número da viagem
			System.out.printf("Viagem %d\n", viagens);
		//	- peça para o usuário a qtde de km da viagem -> sentinela é o -1 (termina o loop)
			System.out.print("Insira a quantidade de km da viagem (-1 para terminar): ");
			int kmDaViagem = entrada.nextInt();
		//	- se km != -1
			if (kmDaViagem != -1) {
		//		- some este valor aos km totais
				kmTotal += kmDaViagem;
				// - mostre a qtde de km totais
				System.out.printf("Total de km: %d\n", kmTotal);
				// - peça para o usuário a qtde de l da viagem
				System.out.print("Insira a quantidade de combustível gasto (em litros): ");
				int lDaViagem = entrada.nextInt();
				// - some este valor aos l totais
				lTotal += lDaViagem;
				// - mostre a qtde de l totais
				System.out.printf("Total de litros de combustível: %d\n", lTotal);
				// - calcule a média de km/l da viagem
				double media = 1.0*kmTotal/lTotal;
				System.out.printf("Média de km/l: %.3f\n", media);
				// - incremente o contador de viagem
				viagens++;
			// - fim se
            }
		// - enquanto o usuário não digitar a sentinela (km = -1)
		} while(kmDaViagem != -1);
		
		System.out.println("Fim do programa.");
	}
}