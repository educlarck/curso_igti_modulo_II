package LeituraTeclado;

import java.math.*; //bibliotecas de codigos j� existentes
import java.util.*;

public class ClasseLeituraTeclado {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		
		Scanner entradaNotas = new Scanner(System.in);
		Scanner entradaCaractere = new Scanner(System.in);
		
		System.out.print("Digite o nome do(a) aluno(a)");
		String nomeAluno = entradaCaractere.nextLine();
		
		System.out.print("Digite um caractere para a situa��o do aluno (O --> OK; P --> Pend�ncia:");
		statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		System.out.print("Digite a frequencia do(a) aluno(a): ");
		frequencia = entradaNotas.nextDouble();
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = totalNotas >= 70 && frequencia >= 0.75;
		
		
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situa��o do(a) aluno(a) � %c\n"
				+ "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado);
		
		
		
		/*char statusAluno;
		boolean aprovado;
		
		nomeAluno = "Robison Cruzo�";
		statusAluno = 'M';
		
		nota1 = 30;
		nota2 = 10;
		nota3 = 30;
		nota4 = 5;
		
		frequencia = 0.80;
		
		totalNotas = nota1 + nota2 + nota3 + nota4;
		
		aprovado = totalNotas >= 70 && frequencia >= 0.75;
		// para o print n�o pensar que se trata de mais um coringa e sim a impress�o do valor em % adicionamos o "%%"
		System.out.printf("O(a) aluno(a) %s obteve nota final %.2f e frequencia %.2f%%. A situa��o do(a) aluno(a) � %c.\n" + "Aluno aprovado? %b", nomeAluno, totalNotas, frequencia*100, statusAluno, aprovado);
		*/
		
		
	}

}