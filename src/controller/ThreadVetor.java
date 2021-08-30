package controller;

public class ThreadVetor extends Thread { //A classe precisa ser extendida para Thread
	
	private int vetor[] = new int [1000]; //Criando um vetor de mil posi��es
	private int op; //Op��o de par ou �mpar
	
	public ThreadVetor(int[] vetor, int op) { //Fazendo "this" com todas as vari�veis
		this.vetor = vetor;
		this.op = op;
	}

	@Override
	public void run() { //Tudo que estiver dentro da class run ser� executado
		tempo(); //Chama o m�todo tempo
	}

	private void tempo() { //M�todo tempo
		
		switch (op) { //Se a op��o for = 1, ir� percorrer o vetor e calcular o tempo usando um for normal
		case 1:
			double TempoInicial = System.nanoTime(); //Usando a classe system para transformar em tempo
			for (int i = 0; i < vetor.length; i++) {//Percorrendo o vetor			
			}	
			double TempoFinal = System.nanoTime();
			double TempoTotal = TempoFinal - TempoInicial; //Calculando o tempo total
			TempoTotal = TempoTotal / Math.pow(10, 9); //Transformando o tempo total em segundos ao inv�s de nano segundos
			System.out.println("Vetor [1000] posi��es (for normal): "+TempoTotal+"s."); //Imprimindo o tempo
			break;
		case 2: //Se a op��o for = 2 ir� percorrer o vetor utilizando uma estrutura for each
			double TempoInicial2 = System.nanoTime();//Usando a classe system para transformar em tempo (nano segundos)
			for (int count : vetor){ //Percorrendo o vetor utilizando a estrutura for each
				}
			double TempoFinal2 = System.nanoTime();
			double TempoTotal2 = TempoFinal2 - TempoInicial2; //Calculando o tempo total
		 TempoTotal = TempoTotal2 / Math.pow(10, 9); //Tranformando o tempo total em segundos ao inv�s de nano segundos
	   	 System.out.println("Vetor [1000] posi��es (for each): "+TempoTotal2+"s."); //Imprimindo o tempo
			
			break;
		
		}
		
		
	}
	
	

}
