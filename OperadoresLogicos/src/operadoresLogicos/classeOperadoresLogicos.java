package operadoresLogicos;

import java.math.*;


public class classeOperadoresLogicos {

	public static void main(String[] args) {
		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clientDeztelas, restricaoCredito;
		
		ult3EmprestQuitadosPrazo = true;
		possuiRendaComprovada = true;
		clientDeztelas = true;
		restricaoCredito = false; // o bom da restri��o de credito � que ela esteja false (ou seja o false deve ser o true, colocar a "!" antes da variavel no print)
		
		boolean concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clientDeztelas) && !restricaoCredito;
		
		System.out.printf("Emprestimo concedido? \n%b",  concederEmprestimo);
		
		

	}

}
