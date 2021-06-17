package CheckPoint2;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		Scanner input =new Scanner (System.in);
		
		Menu menu = new Menu();
		int opcao = menu.selecionarOpcao();
		
		double num1;
		double num2;
		double num3;
		double result;
		
		switch (opcao) {
		
		case 1:
			System.out.println("Você escolheu a opção somar, entre com os números para ver o resultado: ");
			System.out.println("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = input.nextDouble();
			result = calculadora.somar(num1, num2);
			menu.showResults(String.valueOf(result));
			break;
			
		case 2:
			System.out.println("Você escolheu a opção subtrair, entre com os números para ver o resultado: ");
			System.out.println("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = input.nextDouble();
			result = calculadora.subtrair(num1, num2);
			menu.showResults(String.valueOf(result));
			break;
			
		case 3:
			System.out.println("Você escolheu a opção multiplicar, entre com os números para ver o resultado: ");
			System.out.println("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = input.nextDouble();
			result = calculadora.multiplicar(num1, num2);
			menu.showResults(String.valueOf(result));
			break;
			
		case 4:
			System.out.println("Você escolheu a opção dividir, entre com os números para ver o resultado: ");
			System.out.println("Digite o primeiro número: ");
			num1 = input.nextDouble();
			System.out.println("Digite o segundo número: ");
			num2 = input.nextDouble();
			result = calculadora.dividir(num1, num2);
			menu.showResults(String.valueOf(result));
			break;
			
		case 5:
			System.out.println("Você escolheu a opção converter de Fahrenheit para Celsius: ");
			System.out.println("Digite o número: ");
			num1 = input.nextDouble();
			result = calculadora.fahrenheitParaCelsius(num1);
			menu.showResults(String.valueOf(result));
			break;
			
		case 6:
			System.out.println("Você escolheu a opção converter de Celsius para Fahrenheit: ");
			System.out.println("Digite o número: ");
			num1 = input.nextDouble();
			result = calculadora.celsiusParaFahrenheit(num1);
			menu.showResults(String.valueOf(result));
			break;
			
		case 7:
			System.out.println("Você escolheu a opção Média Escolar: ");
			System.out.println("Digite o número: ");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			num3 = input.nextDouble();
			String mediaEscolar= calculadora.mediaEscolar(num1, num2, num3, false);
			menu.showResults(mediaEscolar);
			break;
		case 8:
			System.out.println("Você escolheu a opção Média Ponderada");
			System.out.println("Digite o número:");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			String mediaPonderada= calculadora.mediaPonderada(num1, num2, false);
			menu.showResults(mediaPonderada);
			break;
		case 9:
			System.out.println("Você escolheu a opção Área do Círculo");
			System.out.println("Digite o raio:");
			num1 = input.nextDouble();
			result = calculadora.areaCirculo(num1);
			menu.showResults(String.valueOf(result));
			break;
		case 10:
			System.out.println("Você escolheu a opção Área do Retângulo");
			System.out.println("Digte a base:");
			num1 = input.nextDouble();
			System.out.println("Digite a Altura:");
			num2 = input.nextDouble();
			result = calculadora.areaRetangulo(num1, num2);
			menu.showResults(String.valueOf(result));
			break;
		case 11:
			System.out.println("Você escolheu a opção Velocidade Média");
			System.out.println("Digite a distância:");
			num1 = input.nextDouble();
			System.out.println("Digite o tempo:");
			num2 = input.nextDouble();
			result = calculadora.velocidadeMedia(num1, num2);
			menu.showResults(String.valueOf(result));
			break;
		case 12:
			System.out.println("Você escolheu a opção somar todos os números");
			System.out.println("Digite um valor:");
			int valor = input.nextInt();
			int resultado = calculadora.somaN(valor);
			menu.showResults(String.valueOf(resultado));
			break;
		case 13:
			System.out.println("Você escolheu a opção Calcular IMC");
			System.out.println("Digite a altura:");
			num1 = input.nextDouble();
			System.out.println("Digite o peso:");
			num2 = input.nextDouble();
			String imc= calculadora.imc(num1, num2);
			menu.showResults(imc);
			break;
			}
		
		
	}


}