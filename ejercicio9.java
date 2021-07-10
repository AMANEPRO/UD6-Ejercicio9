package UD6;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class ejercicio9 {

	public static void main(String[] args) {
		
		String tamañostringbeta=JOptionPane.showInputDialog("Introduce la cantidad de numeros que quieres recibir");
		
		int tamañostring=Integer.parseInt(tamañostringbeta);
		
		int[] numeros = new int[tamañostring];   
		
		int suma=0;
	    
	    for(int iniciorango = 0; iniciorango < numeros.length; iniciorango++) {
	      numeros[iniciorango] = (int)(Math.random()*9 + 1);
	      suma = suma + numeros[iniciorango];
	    }
	    
	    System.out.println("Los numeros generados son: " + Arrays.toString(numeros));		
	    System.out.println("La suma de estos es  " + + suma);
	}

}