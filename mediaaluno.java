package Atividades;

import java.util.Scanner;

public class mediaaluno {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner ler = new Scanner(System.in); 
	float dias,meses,anos,calculeMes,calculeanos,data;
	System.out.println("Quantos anos voc� tem?\n");
	anos = ler.nextInt();
	System.out.println("Quantos meses completos tem ap�s seu aniversario?\n");
	meses = ler.nextInt();
	System.out.println("Quantos dias voc� tem ap�s seu �ltimo mesvers�rio?\n");
	dias = ler.nextInt();
	
	calculeMes = meses * 30;
	calculeanos = anos * 365;
	data =calculeMes + calculeanos;
	System.out.println(data );
	}

}