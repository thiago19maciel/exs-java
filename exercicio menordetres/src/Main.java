import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,n3,menor;
		System.out.print("Primeiro valor: ");
		n1 = sc.nextInt();
		menor = n1;
		System.out.print("Segundo valor: ");
		n2 = sc.nextInt();
		if(n2 < menor) {
			menor = n2;
		}
		System.out.print("Terceiro valor: ");
		n3 = sc.nextInt();
		if(n3 < menor) {
			menor = n3;
		}
		
		System.out.println("Menor = " + menor);
		sc.close();
		
	}

}
