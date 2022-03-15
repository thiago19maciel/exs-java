import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double n1 = -1,n2 = -1,media;
		while (n1 < 0 || n1 > 10) {
			System.out.print("Digite a primeira nota: ");
			n1 = sc.nextDouble();
			if (n1 < 0) {
				System.out.print("Valor Invalido! Tente novamente: ");
			}
		}
		while (n2 < 0 || n2 > 10) {
			System.out.print("Digite a segunda nota: ");
			n2 = sc.nextDouble();
			if (n2 < 0 || n2 > 10) {
				System.out.print("Valor Invalido! Tente novamente: ");
			}
		}
		media = (n1 + n2) / 2;
		System.out.println("MEDIA = " + String.format("%.2f", media));
		sc.close();
	}

} 
