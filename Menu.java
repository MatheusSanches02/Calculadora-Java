package CheckPoint2;

import java.util.Scanner;

public class Menu {
	public Menu (){
		System.out.println("Bem-vindo � Calculadora JoinTech!");
	}
	
	public int selecionarOpcao () {
		
		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		
		this.showOptions();
		opcao = input.nextInt();
		
		while (opcao < 1 || opcao > 13) {
		
			System.err.println("Op��o inv�lida");
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
		System.out.println("5- Convers�o de Fahrenheit para Celsius");
		System.out.println("6- Convers�o de Celsius para Fahrenheit");
		System.out.println("7- Calcular M�dia Escolar");
		System.out.println("8- Calcular M�dia Ponderada");
		System.out.println("9- Calcular �rea do c�rculo");
		System.out.println("10- Calcular �rea do ret�ngulo");
		System.out.println("11- Calcular Velocidade M�dia");
		System.out.println("12- Calcular Somar entre 1 e N ");
		System.out.println("13- Calcular IMC");
		System.out.println("Escolha uma op��o:");
	
	}
	
	public void showResults (String result) {
		System.out.println("O resultado foi: " + result);
	}

}
