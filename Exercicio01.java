package curso_java;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int a = 0, b = 0, m = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com dois valores inteiros");
		System.out.print("Valor 01:");
		a = sc.nextInt();
		System.out.print("Valor 02:");
		b = sc.nextInt();
		System.out.println("A Soma é igual à: " + (a+b));
		sc.close();
	}

}
