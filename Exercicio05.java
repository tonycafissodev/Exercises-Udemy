package curso_java;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		int cod1, cod2;
		int qty1, qty2;
		double v_unit1, v_unit2;
		Scanner sc = new Scanner(System.in);
		
		//Dados pe�a 01
		System.out.println("Valor total da compra de pe�as");
		System.out.print("Digite o c�digo da pe�a 01: ");
		cod1 = sc.nextInt();
		System.out.print("Digite a quantidade de pe�as 01: ");
		qty1 = sc.nextInt();
		System.out.println("Valor unit�rio pe�a 01: ");
		v_unit1 = sc.nextDouble();
		
		//Dados pe�a 02
		System.out.print("Digite o c�digo da pe�a 02: ");
		cod2 = sc.nextInt();
		System.out.print("Digite a quantidade de pe�as 02: ");
		qty2 = sc.nextInt();
		System.out.println("Valor unit�rio pe�a 01: ");
		v_unit2 = sc.nextDouble();
		
		//Resultado
		System.out.printf("Valor pe�a 01 %.2f", (qty1 * v_unit1));
		System.out.printf("\nValor pe�a 02 %.2f", (qty2 * v_unit2));
		System.out.printf("\nValor total %.2f", (qty1 * v_unit1)+ (qty2 * v_unit2));

	}
}
