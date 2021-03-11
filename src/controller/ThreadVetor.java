package controller;

import java.util.Random;

public class ThreadVetor extends Thread {
	
	private int num;
	private int vet[];
	Random random = new Random();
	
	public ThreadVetor(int num, int vet[]) {
		this.num = num;
		this.vet = vet;
	}
	
	@Override
	public void run() {
		if (num % 2 == 0) {
			double tempoInicial = System.nanoTime();
			
			for (int i = 0; i < vet.length; i++) {
				vet[i] = (int) (Math.random()*101);
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);;
			System.out.println("Para percorrer o vetor na estrutura For demorou " + tempoTotal + " s");
		}else {
			double tempoInicial = System.nanoTime();
			
			for (int i : vet) {}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = (tempoFinal - tempoInicial)/Math.pow(10, 9);
			System.out.println("Para percorrer o vetor na estrutura Foreach demorou " + tempoTotal + " s");
		}
	}


}
