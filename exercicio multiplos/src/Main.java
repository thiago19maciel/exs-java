import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int maior, menor;
		if (n1 > n2) {
			maior = n1;
			menor = n2;
		}else {
			maior = n2;
			menor = n1;
		}
		
		if (maior % menor == 0) {
			System.out.println("Sao multiplos");
		}else {
			System.out.println("Nao sao multiplos");
		}
		sc.close();
	}

}
