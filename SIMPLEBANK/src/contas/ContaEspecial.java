package contas;

import classes.Taxas;
import usuario.Correntista;

public final class ContaEspecial extends Conta implements Taxas{
	
	private double limite;
	
	
	public ContaEspecial() {
	}
	
	public ContaEspecial(int numero, Correntista titular, double saldo, double limite) {
		super(numero,titular,saldo);
		this.limite=limite;
		
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public void saque(double valor) {
			
			if((this.getSaldo() - valor) >= this.getLimite()) {
				this.setSaldo(this.getSaldo()-valor);
				System.out.println("Saque efetuado");
			}else {
				System.out.println("Saldo insuficiente para saque");
			}
			
		}
	
	public double getTaxaManutencao() {
		return 15.00;
	}
	
	public void descontarTaxaManutencao() {
		this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
		
	}
}

