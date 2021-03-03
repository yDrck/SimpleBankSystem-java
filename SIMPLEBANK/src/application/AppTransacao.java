package application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import classes.Movimento;
import classes.Transacao;
import contas.Conta;
import contas.ContaComum;

import usuario.Correntista;

public class AppTransacao {

	public static void main(String[] args) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Movimento moviment = new Movimento();
		Correntista usuario = new Correntista("Fulano", "fulano@gmail.com", "48917232131");
		Conta contacomum = new ContaComum(102823, usuario, 5000);
		Transacao transacoes = new Transacao();
		
		double saldoanterior = contacomum.getSaldo();
		
		transacoes.realizarTransacao(new Date(), contacomum,100, "Depósito em dinheiro",1);
		transacoes.realizarTransacao(new Date(), contacomum,200, "Saque em dinheiro",0);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Emissão de boleto das transferências");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for (Movimento elem : transacoes.getMovimentos()) {
		
			System.out.println("Data da operação: " + dateFormat.format(elem.getData()));
			System.out.println("Histórico: "+ elem.getHistorico());
			System.out.println("Saldo anterior: R$"+ elem.getSaldoanterior());
			System.out.println("Valor: R$"+ elem.getValor());
			System.out.println("-----------------------");
		}
		System.out.println("Saldo atual: R$" + contacomum.getSaldo());
	}


}
