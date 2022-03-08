import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double unitario,dinheiro_recebido,total;
		int unidades;
		
		System.out.print("Preco unitario do produto: R$");
		unitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		unidades = sc.nextInt();
		System.out.print("Dinheiro recebido: R$");
		dinheiro_recebido = sc.nextDouble();
		total = unitario * unidades;
		if (dinheiro_recebido < total) {
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM "+ 
			String.format("%.2f", total - dinheiro_recebido) + " REAIS");			
		}else {
			System.out.println("TROCO = R$" + String.format("%.2f", dinheiro_recebido - total));
		}		
		sc.close();
	}
}
