package curso_java;
import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		int num = 0;
		double hours, value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculo de salário de um funcionário");
		System.out.print("Entre com o número do funcionario: ");
		num = sc.nextInt();
		System.out.print("Quantidade de horas trabalhadas: ");
		hours = sc.nextDouble();
		System.out.print("Valor pago por hora: ");
		value = sc.nextDouble();
		System.out.print("Nº Funcionario: "+ num);
		System.out.printf("%nSalário: %.2f",(hours * value));
	}
}
