import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		int gas = 0,alc = 0,die = 0;
		while (opcao != 4) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar: ");
			opcao = sc.nextInt();
			switch (opcao) {
				case 1:
					gas += 1;
					break;
				case 2:
					alc += 1;
					break;
				case 3:
					die += 1;
					break;
			}
		}
	System.out.println("Muito obrigado! \nGasolina: " + gas + "\nAlcool: " + alc + "\nDiesel: " + die);
	sc.close();
	}

}
