import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x,y,maior,menor;
		int soma = 0;
		System.out.println("Digite dois numeros: ");
		x = sc.nextInt();
		y = sc.nextInt();
		if (x > y) {
			maior = x;
			menor = y;
		}else {
			maior = y;
			menor = x;
		}
		
		for (int i = menor; i < maior; i++) {
			if (i % 2 == 1){
				soma += i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES: " + soma);
		
		
	}

}
