package pacoteExemplo;

public class ClasseExemplo {

	public static void main(String[] args) {
		
		String nome, nome2;
		nome = "Eduardo Clarck Duarte Gomes";
		nome2 = "Jessica Castro Araujo";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
		
		System.out.println("A variavel nome tem " + tamanhoDoNome + " caracteres");
		System.out.println("A variavel nome 2 tem " + tamanhoDoNome2 + " caracteres");
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres dos dois nomes é : " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('a',  '7');
		System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(0, 14);
		System.out.println(somenteNome);
		
		String nomeTudoMaiusculo = nome.toUpperCase();
		System.out.println(nomeTudoMaiusculo);
		
		String nomeTudoMinusculo = nome2.toLowerCase();
		System.out.println(nomeTudoMinusculo);
		
	}

}
