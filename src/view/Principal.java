package view;

import java.util.Scanner; //Importando a biblioteca Scanner
import controller.ThreadVetor; //Importando a classe ThreadVetor
import java.util.Random; //Importando a biblioteca random para n�meros aleat�rios

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //M�todo construtor para o scanner
		Random random = new Random();//M�todo construtor para random
		
		
		System.out.println("Digite a op��o 1(for normal) ou 2(for each):");
		int op = sc.nextInt(); //Condi��o para o switch case
		int vetor[] = new int [1000]; 
		
		for (int i = 0; i < 1000; i++) { //Gerando n�meros aleat�rios para o vetor
			vetor[i] = random.nextInt(101);
		}
			
		Thread Ttempo = new ThreadVetor(vetor,op); //M�todo construtor
		Ttempo.start();//Startando a Thread

	}

}
