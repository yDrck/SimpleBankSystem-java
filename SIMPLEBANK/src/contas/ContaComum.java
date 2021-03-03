package contas;


import classes.Taxas;
import usuario.Correntista;

public final class ContaComum extends Conta implements Taxas{

	public ContaComum() {
		
	}

	public ContaComum(int numero, Correntista titular, double saldo) {
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

	@Override
	public double getTaxaManutencao() {
		return 15.00;
	}

	@Override
	public void descontarTaxaManutencao() {
		this.setSaldo(this.getSaldo() - this.getTaxaManutencao());
		
	}
	
	
}
	
	
	
	
	
	

