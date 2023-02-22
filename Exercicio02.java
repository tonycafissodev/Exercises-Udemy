package curso_java;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = 0 , a = 0, p = 3.14;
		System.out.println("Digite o raio de um circulo: ");
		r = sc.nextInt();
		a = p * (r*r);
		System.out.println("A area do circulo é igual a " + a);
	}
}
