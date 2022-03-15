import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int qtd = sc.nextInt();
		int [] vetor = new int [qtd];
		for (int i = 0; i < qtd; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		for (int i = 0; i < qtd; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]); 
			}
		}
		
	sc.close();
	}

}
 
 