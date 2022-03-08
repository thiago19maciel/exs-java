//Problema "dardo"
//No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir.
//Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual
//foi a maior.
//Exemplo 1:
//Digite as tres distancias:
//83.21
//79.53
//89.15
//MAIOR DISTANCIA = 89.15
//Exemplo 2:
//Digite as tres distancias:
//83.21
//87.20
//83.21
//MAIOR DISTANCIA = 87.20
import java.util.Scanner;
import java.util.Locale;


public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia1, distancia2, distancia3, maior;
		System.out.println("Digite as tres distancias: ");
		distancia1 = sc.nextDouble();
		maior = distancia1;
		
		distancia2 = sc.nextDouble();
		if (distancia2 > maior) {
			maior = distancia2;
		}
		
		distancia3 = sc.nextDouble();
		if (distancia3 > maior) {
			maior = distancia3;
		}
		
		System.out.println("Maior distancia: " + String.format("%.2f", maior));
		sc.close();
	}

}
