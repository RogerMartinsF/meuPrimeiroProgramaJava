/**
 * 
 */
package meuPrimeiroProgramaJava;

import java.util.Scanner;


/**
 * @author Dell
 *
 */
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Ol? mundo!\nQual ? o seu nome!");
		
		Scanner in = new Scanner(System.in);
		String nome = in.nextLine();
		System.out.printf("Ol? %s!\n", nome);
		

	}

}
