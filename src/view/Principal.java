package view;

import java.util.Scanner; //Importando a biblioteca Scanner
import controller.ThreadVetor; //Importando a classe ThreadVetor
import java.util.Random; //Importando a biblioteca random para números aleatórios

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //Método construtor para o scanner
		Random random = new Random();//Método construtor para random
		
		
		System.out.println("Digite a opção 1(for normal) ou 2(for each):");
		int op = sc.nextInt(); //Condição para o switch case
		int vetor[] = new int [1000]; 
		
		for (int i = 0; i < 1000; i++) { //Gerando números aleatórios para o vetor
			vetor[i] = random.nextInt(101);
		}
			
		Thread Ttempo = new ThreadVetor(vetor,op); //Método construtor
		Ttempo.start();//Startando a Thread

	}

}
