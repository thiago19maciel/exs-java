import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Hora inicial: ");
		int inicial = sc.nextInt();
		System.out.print("Hora final: ");
		int fim = sc.nextInt();
		int calculo;
		
		if (fim < inicial) {
			calculo = 24 - (inicial - fim);
		}else if(inicial == fim){
			calculo = 24;
		}else {
			calculo = fim - inicial;
		}
		System.out.println("O JOGO DUROU " + calculo + " HORA(S)");
		
		
	sc.close();
	}


}