package operadoresExemplo;

import java.math.*;

public class operadoresExemploCalculo {

	public static void main(String[] args) {
		// x^2 + 12x -13 = 0
		// 2x^2 - 16x -18 = 0
		
		double a, b, c;
		
		a = 2;
		b = -16;
		c = -18;
		
		double delta = 0;
		
		delta = (b * b) - (4 * a * c);
		
		System.out.printf("O valor do delta �: %.2f\n", delta);
		
		double x_linha = 0;
		x_linha = (-b + Math.sqrt(delta)) / (2*a);
		
		System.out.printf("O valor de X' �: %.0f\n",x_linha);
		
		double x_duasLinhas = 0;
		x_duasLinhas = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O valor de X'' �: %.0f",x_duasLinhas);
		
		
		
		

	}

}
