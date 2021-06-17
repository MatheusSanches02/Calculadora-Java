package CheckPoint2;

import java.util.Scanner;

public class Menu {
	public Menu (){
		System.out.println("Bem-vindo à Calculadora JoinTech!");
	}
	
	public int selecionarOpcao () {
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		this.showOptions();
		opcao = input.nextInt();
		
		while (opcao < 1 || opcao > 13) {
		
			System.err.println("Opção inválida");
			this.showOptions();
			opcao = input.nextInt();
			
		}	
		
		return opcao;
	}
	
	private void showOptions () {
		System.out.println("1- Somar");
		System.out.println("2- Subtrair");
		System.out.println("3- Multiplicar");
		System.out.println("4- Dividir");
		System.out.println("5- Conversão de Fahrenheit para Celsius");
		System.out.println("6- Conversão de Celsius para Fahrenheit");
		System.out.println("7- Calcular Média Escolar");
		System.out.println("8- Calcular Média Ponderada");
		System.out.println("9- Calcular Área do círculo");
		System.out.println("10- Calcular Área do retângulo");
		System.out.println("11- Calcular Velocidade Média");
		System.out.println("12- Calcular Somar entre 1 e N ");
		System.out.println("13- Calcular IMC");
		System.out.println("Escolha uma opção:");
	
	}
	
	public void showResults (String result) {
		System.out.println("O resultado foi: " + result);
	}

}
