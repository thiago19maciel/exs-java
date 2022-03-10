import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite as coordenadas x e y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Quadrante 1");
			}else if (x < 0 && y > 0) {
				System.out.println("Quadrante 2");
			}else if (x > 0 && y < 0) {
				System.out.println("Quadrante 3");
			}else if (x < 0 && y < 0) {
				System.out.println("Quadrante 4");
			}
			System.out.println("Digite as coordenadas x e y: ");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("1 ou 2 coordenadas nulas");
		
	sc.close();
	}

}
