package curso_java;
import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		int A, B, C, D;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com quatro valores inteiros");
		System.out.print("Valor A:");
		A = sc.nextInt();
		System.out.print("Valor B:");
		B = sc.nextInt();
		System.out.print("Valor C:");
		C = sc.nextInt();
		System.out.print("Valor D:");
		D = sc.nextInt();

		System.out.println("O resultado do calculo de (A * B) - (C * D) é:" + ((A*B)-(C*D)));
	}
}
