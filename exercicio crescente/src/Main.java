import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		System.out.println("Digite dois numeros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		while (n1 != n2) {
			if (n1 < n2) {
				System.out.println("Crescente");
			}
			else if(n2 < n1) {
				System.out.println("Decrescente");
			}
			System.out.println("Digite dois numeros: ");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		System.out.println("Fim");
		sc.close();
	}

}
