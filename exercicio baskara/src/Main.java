import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		double x1,x2,delta;
		System.out.print("Coeficiente a: ");
		a = sc.nextInt();
		System.out.print("Coeficiente b: ");
		b = sc.nextInt();
		System.out.print("Coeficiente c: ");
		c = sc.nextInt();
		delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0) {
			System.out.println("Esta equacao nao possui raizes reais");
		}else {
			x1 = (-b + Math.sqrt(delta)) / 2 * a;
			x2 = (-b - Math.sqrt(delta)) / 2 * a;
			System.out.println("X1 = " + String.format("%.4f", x1));
			System.out.println("X2 = " + String.format("%.4f", x2));
		}
		sc.close();
		
	}

}
