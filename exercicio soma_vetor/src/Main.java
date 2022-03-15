import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("tamanho do vetor: ");
		int n = sc.nextInt();
		double [] vetor = new double [n];
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			soma += vetor[i];
		}
		
		System.out.print("Valores = ");
		for (int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println("\nSoma = " + soma);
		System.out.println("Media = " + soma/n);
		
	sc.close();
	}

}
//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
//- Imprimir todos os elementos do vetor 
//- Mostrar na tela a soma e a média dos elementos do vetor 
//Exemplo: 
//Quantos numeros voce vai digitar? 4
//Digite um numero: 8.0
//Digite um numero: 4.0
//Digite um numero: 10.0
//Digite um numero: 14.0
//VALORES = 8.0 4.0 10.0 14.0 
//SOMA = 36.00 
//MEDIA = 9.00 