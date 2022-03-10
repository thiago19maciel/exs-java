import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario,aumento;
		System.out.print("Digite o salario da pessoa: ");
		salario = sc.nextDouble();
		if (salario <= 1000) {
			aumento = 0.2;
		}else if (salario <= 3000) {
			aumento = 0.15;
		}else if (salario <= 8000) {
			aumento = 0.1;
		}else {
			aumento = 0.05;
		}
		System.out.println("Novo salario: R$" + String.format("%.2f", salario +(salario * aumento)));
		System.out.println("Aumento: R$" + String.format("%.2f", salario * aumento));
		System.out.println("Porcentagem: " + String.format("%.0f", aumento * 100) + "%");
		sc.close();
	}

}