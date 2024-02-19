package tarefa_controleDeFluxo;

import java.util.Scanner;

public class ControleDeFluxo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota = 0;
		double somadasNotas = 0;

		for (int i = 1; i <= 4; i++) {
			System.out.println("Digite sua Nota"+ i + ": ");
			nota = sc.nextInt();
			somadasNotas += nota;
		}

		double resultado = somadasNotas / 4;

		if (resultado >= 7) {
			System.out.println("\nNota: " + resultado + " Aluno APROVADO");
		} else if (resultado >= 5) {
			System.out.println("\nNota: " + resultado + " Aluno de RECUPERAÇÂO");
		} else {
			System.out.println("\nNota: " + resultado + " Aluno REPROVADO");
		}

		sc.close();

	}

}
