package praticaIntegradora;

public class exemploPraticaIntegradora {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		String nomeAluno;
		char statusAluno;
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
		
		
		
	}

}
