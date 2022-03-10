import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as idades: ");
		int idade,soma = 0, cont = 0;
		double media;
		idade = sc.nextInt();
		if (idade < 0) {
			System.out.println("Nao foi possivel calcular");
		}else {
			while (idade > 0) {
				cont += 1;
				soma += idade;
				idade = sc.nextInt();
			}
			media = (double)soma / cont;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		sc.close();
	}

}