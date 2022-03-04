import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Base do retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Altura do retangulo: ");
		double altura = sc.nextDouble();
		double area,perimetro,diagonal;
		area = base * altura;
		perimetro = (base * 2) + (altura * 2);
		diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura,2.0));
		System.out.println("Area = " + String.format("%.6f", area));
		System.out.println("Perimetro = " + String.format("%.6f", perimetro));
		System.out.println("Diagonal = " + String.format("%.6f", diagonal));
		
		sc.close();
	}

}
