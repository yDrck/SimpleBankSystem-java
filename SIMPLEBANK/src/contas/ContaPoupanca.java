package contas;

import usuario.Correntista;

public class ContaPoupanca extends Conta{

	public ContaPoupanca() {
		
	}

	public ContaPoupanca(int numero, Correntista titular, double saldo) {
		super(numero, titular, saldo);
	}
	
	@Override
	public void saque(double valor) {
			
			if(this.getSaldo() >= valor) {
				this.saldo -= valor;
				System.out.println("Saque efetuado");
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
			
		}
	
	
}
