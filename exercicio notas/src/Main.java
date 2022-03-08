import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		media = (n1 + n2) / 2;
		System.out.println("Nota final = " + String.format("%.1f", media));
		if (media < 60.00) {
			System.out.println("Reprovado");
		}
		sc.close();
	}

}
