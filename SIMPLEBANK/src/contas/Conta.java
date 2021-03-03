package contas;

import java.util.Scanner;

import usuario.Correntista;

/**
 * A classe <b>Conta<b> define um tipo de dado abstrato para a criação da estrutura de classe
 * de contas bancárias
 * 
 * @author Rodrigo Talman Mendes.
 * @since mar 2021.
 * @version 1.0
 *  
 */

public class  Conta {

	protected int numero;
	protected Correntista titular;
	protected double saldo;
	private static int incrementaConta;
	public final static int SACAR = 0;
	public final static int DEPOSITAR = 1;
	
	Scanner sc = new Scanner(System.in);
	
	
	public Conta() {
		incrementaConta = getIncrementaConta() + 1;
	}
	
	
	public Conta(int numero, Correntista titular, double saldo) {
		this();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}


	public final int getNumero() {
		return numero;
	}


	public final void setNumero(int numero) {
		this.numero = numero;
	}


	public final Correntista getTitular() {
		return titular;
	}


	public final void setTitular(Correntista titular) {
		this.titular = titular;
	}


	public final double getSaldo() {
		return saldo;
	}


	public final void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public static int getIncrementaConta() {
		return incrementaConta;
	}
	
	
	public final void deposito(double valor) {
		
		this.saldo += valor;
		System.out.println("Depósito efetuado");
	}
	
	public void saque(double valor) {
		
		if(this.getSaldo() >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado");
		}else {
			System.out.println("Saldo insuficiente para saque");
		}
		
	}
	
	public void movimentar(double valor, int operacao) {
		
		switch (operacao){
			case SACAR:
				this.saque(valor);
				break;
			case DEPOSITAR:
				this.deposito(valor);
				break;
			default:
				System.out.println("Operação inválida");
		}
//		sc.close();
	}
	
	
	public final String toString() {
		return "Conta [Numero da conta = " + this.numero + ", Titular = " 
				+ this.titular  +", Contas criadas: "+ getIncrementaConta()  +"]";
	}
		
}
