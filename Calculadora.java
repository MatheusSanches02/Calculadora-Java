package CheckPoint2;

import java.util.Scanner;

public class Calculadora {

	double somar (double num1, double num2) {
		return num1 + num2;
		
	}
	double subtrair (double num1, double num2) {
		return num1 - num2;
	}
	
	double multiplicar (double num1, double num2) {
		return num1 * num2;
	}
	
	double dividir (double num1, double num2) {
		return num1 / num2;
	}
	
	double fahrenheitParaCelsius (double valor) {
		return (valor - 32) * 5/9;
	}
	
	double celsiusParaFahrenheit (double valor) {
		return (valor * 9/5) + 32;
		
	}
	double areaCirculo(double raio) {
		return (3.14*raio*raio);
	}
	double  areaRetangulo(double base, double altura) {
		return(base*altura);
	}
	double velocidadeMedia(double distancia, double tempo) {
		return(distancia/tempo);
	}
	String imc(double altura, double peso) {
		double massa = (peso/(Math.pow(altura, altura)));
		String result = "";
		if(massa<26) {
			result ="Normal";
		} else if(massa>=26 && massa<30) {
			result ="Obeso";
		}else{
			result ="Obeso Mórbido";
		}
		return result;
	}
	
	int somaN (int valor) {
		if(valor<=0) {
			Scanner input = new Scanner(System.in);
			while(valor<=0) {
				System.out.println("Digite um número maior que 0");
				valor = input.nextInt();
			}
		}
		int result=0;
		for (int i =2; i<valor;i++) {
			result=result+i;
		}
		return result;
	}

	String mediaEscolar (double num1, double num2, double num3, boolean provaSubstitutiva) {
		double result = (num1 + num2 + num3)/3;
		String media = "";
		if (result >= 6) {
			media = "Aprovado!";
		}
		else if (result >= 5 && result < 6 && !provaSubstitutiva) {
			media = "Prova Substitutiva!";
			
			System.out.println("Prova substitutiva, entre com as novas notas para realizar um novo calculo");
			Scanner input = new Scanner(System.in);
			double valor1 = input.nextDouble();
			double valor2 = input.nextDouble();
			double valor3 = input.nextDouble();
			
			media = this.mediaEscolar(valor1, valor2, valor3, true);
		}
		else {
			media = "Reprovado";
		}
		return media;
	}
	String mediaPonderada (double num1, double num2, boolean provaSubstitutiva) {
		double result = (num1*4 + num2*6 )/10;
		String media = "";
		if (result >= 6) {
			media = "Aprovado!";
		}
		else if (result >= 5 && result < 6 && !provaSubstitutiva) {
			media = "Prova Substitutiva!";
			
			System.out.println("Prova substitutiva, entre com as novas notas para realizar um novo calculo");
			Scanner input = new Scanner(System.in);
			double valor1 = input.nextDouble();
			double valor2 = input.nextDouble();
			
			media = this.mediaPonderada(valor1, valor2, true);
		}
		else {
			media = "Reprovado";
		}
		return media;
	}
	
	
}

