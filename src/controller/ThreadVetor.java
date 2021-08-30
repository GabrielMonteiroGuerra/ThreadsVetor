package controller;

public class ThreadVetor extends Thread { //A classe precisa ser extendida para Thread
	
	private int vetor[] = new int [1000]; //Criando um vetor de mil posições
	private int op; //Opção de par ou ímpar
	
	public ThreadVetor(int[] vetor, int op) { //Fazendo "this" com todas as variáveis
		this.vetor = vetor;
		this.op = op;
	}

	@Override
	public void run() { //Tudo que estiver dentro da class run será executado
		tempo(); //Chama o método tempo
	}

	private void tempo() { //Método tempo
		
		switch (op) { //Se a opção for = 1, irá percorrer o vetor e calcular o tempo usando um for normal
		case 1:
			double TempoInicial = System.nanoTime(); //Usando a classe system para transformar em tempo
			for (int i = 0; i < vetor.length; i++) {//Percorrendo o vetor			
			}	
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial; //Calculando o tempo total
			TempoTotal = TempoTotal / Math.pow(10, 9); //Transformando o tempo total em segundos ao invés de nano segundos
			System.out.println("Vetor [1000] posições (for normal): "+TempoTotal+"s."); //Imprimindo o tempo
			break;
		case 2: //Se a opção for = 2 irá percorrer o vetor utilizando uma estrutura for each
			double TempoInicial2 = System.nanoTime();//Usando a classe system para transformar em tempo (nano segundos)
			for (int count : vetor){ //Percorrendo o vetor utilizando a estrutura for each
				}
			double TempoFinal2 = System.nanoTime();
			double TempoTotal2 = TempoFinal2 - TempoInicial2; //Calculando o tempo total
		 TempoTotal = TempoTotal2 / Math.pow(10, 9); //Tranformando o tempo total em segundos ao invés de nano segundos
	   	 System.out.println("Vetor [1000] posições (for each): "+TempoTotal2+"s."); //Imprimindo o tempo
			
			break;
		
		}
		
		
	}
	
	

}
