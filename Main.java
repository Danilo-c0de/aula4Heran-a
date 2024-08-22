package principal;

import java.util.List;
import java.util.Scanner;

import herança.conta;

import java.util.ArrayList;

public class Main {

Scanner scn = new Scanner (System.in);
	
  

	while(i = 1)
		
		System.out.print("Digite seu nome: ");
		String nome = scn.next();
		
		System.out.print("Digite o numero da conta: "); 
		int numero = scn.nextInt();
		
		System.out.print("Digite o saldo da conta: "); 
		double saldo = scn.nextDouble();
		
		
		System.out.print("Digite o limite da conta: ");
		double limite = scn.nextDouble();
		
		conta cc = new ContaComercial(nome, numero, saldo, limite);
		
		List<conta> Lista = new ArrayList<>();
		Lista.add(cc);
		
		System.out.println(Lista);
		
		i++;
	}
}		
	
	


