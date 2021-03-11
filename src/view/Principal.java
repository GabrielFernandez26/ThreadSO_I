package view;

import java.util.Scanner;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		

		int vet [] = new int[1000];
		
		Thread t1 = new ThreadVetor(1, vet);
		Thread t2 = new ThreadVetor(2, vet);
		
		t1.start();
		t2.start();
	}

}
