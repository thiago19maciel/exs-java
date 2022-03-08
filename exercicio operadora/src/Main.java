import java.util.Scanner;
import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valor = 50.00;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		if (minutos > 100){
			valor += (minutos - 100) * 2.00;
		}
		
		System.out.println("Valor a pagar: R$" + String.format("%.2f", valor));
		sc.close();
	}

}
