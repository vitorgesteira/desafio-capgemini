package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quest?o 1");
		desafio1(sc);		
		sc.nextLine();
		System.out.println("--------------------------------");
		
		System.out.println("Quest?o 2");
		System.out.print("Digite senha segura: ");
		System.out.println(desafio2(sc.nextLine()));
		System.out.println("--------------------------------");
		
		System.out.println("Quest?o 3");
		desafio3(sc);
		
		sc.close();
	}		
	
	//fun??o da quest?o 1
	public static void desafio1(Scanner sc) {

		//lista para guardar os degraus
		List<String> degraus = new ArrayList<>();
		
		System.out.print("Digite numero degraus: ");
		int n = sc.nextInt();
		System.out.println();

		//for para preencher a lista com as linhas representando os degraus
		for (int i = 1; i <= n; i++) {
			degraus.add(" ".repeat(n - i) + "*".repeat(i));
		}

		//imprimi a lista
		for (String d : degraus) {
			System.out.println(d);
		}
		
	}
	
	//fun??o da quest?o 2
	public static String desafio2(String senha) {			
		
		String retorno = "";
		
		//verifica se a senha ? segura pelo tamanho dela
		if(senha.length() < 6) {
			int falta = 6 - senha.length();
			retorno = ("Falta pelo menos " 
								+ falta 
								+ " caracteres para a senha ser segura");
		}
		else {
			retorno = ("senha segura!");
		}
		
		return retorno;
	}
	
	//fun??o da questao 3
	public static void desafio3(Scanner sc) {
		
		System.out.print("Escreva uma palavra: ");
		String palavra = sc.nextLine();
		
		ArrayList<String> anagramas = new ArrayList<String>();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 1; j < palavra.length(); j++) {
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
					if (palavra.charAt(i) == palavra.charAt(i + 1)) {
						String x = palavra.substring(i, i + 1);
						anagramas.add(x);
					} else {
						String y = palavra.substring(i, j);
						String z = palavra.substring(i + 1, j + 1);
						String h = palavra.substring(i, i + 1);
						anagramas.add(h);
						anagramas.add(y);
						anagramas.add(z);
					}
				}
			}
		}

		System.out.println(anagramas.size());
	}

}
