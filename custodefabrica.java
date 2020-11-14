package Atividades;

import java.util.Scanner;

public class custodefabrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		float custoFabr;
		double custoFinal;
		
		System.out.println("Valor do carro na fabrica ? ");
		custoFabr = ler.nextFloat();
		custoFinal = custoFabr*1.73;
		
		System.out.println(custoFinal);
		
	}
	
	
	

}
